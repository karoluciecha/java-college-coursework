package pdf;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;
import org.apache.pdfbox.text.PDDocumentTextStripper;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class pdf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj nazwę pliku PDF: ");
        String nazwaPliku = scanner.nextLine();

        System.out.print("Podaj hasło: ");
        String haslo = scanner.nextLine();

        try {
            File plikPDF = new File(nazwaPliku);
            PDDocument dokument = PDDocument.load(plikPDF, haslo);

            if (dokument.isEncrypted()) {
                // Jeśli plik jest zabezpieczony hasłem, to zostanie otwarty po poprawnym podaniu hasła.
                PDDocumentInformation informacje = dokument.getDocumentInformation();
                System.out.println("Autor: " + informacje.getAuthor());
                System.out.println("Tytuł: " + informacje.getTitle());

                PDDocumentTextStripper stripper = new PDDocumentTextStripper();
                String tekst = stripper.getText(dokument);
                System.out.println("Zawartość PDF:\n" + tekst);

                dokument.close();
            } else {
                System.out.println("Ten plik PDF nie jest zabezpieczony hasłem.");
            }
        } catch (IOException e) {
            System.err.println("Błąd podczas otwierania pliku PDF: " + e.getMessage());
        }
    }
}