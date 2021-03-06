package com.yet.spring.core.loggers;

import com.yet.spring.core.beans.Event;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by Sanya on 19.08.2018.
 */
public class FileEventLogger extends AbstractLogger {
    private File file;
    private String filename;

    public FileEventLogger(String filename) {
        this.filename = filename;
    }

    @Override
    public void logEvent(Event event) {
        try {
            FileUtils.writeStringToFile(file, event.toString() + "\n", true);
        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void init() throws IOException {
        this.file = new File(filename);
        if(file.exists() && !file.canWrite()) {
            throw new IllegalArgumentException("Can't write to file " + filename);
        } else if(!file.exists()) {
            try {
                file.createNewFile();
            }
            catch (Exception e) {
                throw new IllegalArgumentException("Can't create file ", e);
            }
        }

    }
}
