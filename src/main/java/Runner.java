import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;

import java.nio.file.Paths;

public class Runner {
    public static void main(String[] args) {
        String repoUrl = "https://github.com/redhat-developer/app-services-guides";
        String cloneDirectoryPath = "tmp"; // Ex.in windows c:\\gitProjects\SpringBootMongoDbCRUD\
        try {
            System.out.println("Cloning "+repoUrl+" into "+repoUrl);
            Git.cloneRepository()
                    .setURI(repoUrl)
                    //.setBranch()
                    //.set
                    .setDirectory(Paths.get(cloneDirectoryPath).toFile())
                    .call();
            System.out.println("Completed Cloning");
        } catch (GitAPIException e) {
            System.out.println("Exception occurred while cloning repo");
            e.printStackTrace();
        }

    }
}
