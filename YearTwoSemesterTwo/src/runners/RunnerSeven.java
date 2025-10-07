package runners;

import java.io.File;

import resources.FileSys;
import resources.TreeTest;

public class RunnerSeven {
	public static void main(String[] args) {
		System.out.println("Running TreeTest:\n");
		new TreeTest();

		System.out.println("\nRunning FileSys()");
		File f = new File("/");
		new FileSys().dfs(f, 0, 3);
	}
}