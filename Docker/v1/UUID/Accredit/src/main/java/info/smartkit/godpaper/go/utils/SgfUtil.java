package info.smartkit.godpaper.go.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

/**
 * Created by smartkit on 04/07/2017.
 */
public class SgfUtil {

        public static String getWorkingDir() {
                String workingDir = System.getProperty("user.dir");
                return workingDir;
        }

        public static String getSgf(String context) {
                // if(!new File("/uploads/").exists()) new File("/uploads/").mkdirs();
                // return "/uploads/";
                return getWorkingDir() + "/target/classes/sgf/" + context;
        }

}
