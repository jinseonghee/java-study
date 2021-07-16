package ch11;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogger {

        Logger logger = Logger.getLogger("mylogger"); //Mylogger는 식별자 , 일종의 싱글톤 패턴
        private static MyLogger instance = new MyLogger();

        public static final String errorLog = "log.txt";
        public static final String warningLog = "warning.txt";
        public static final String fineLog = "fine.txt";

        private FileHandler logFile = null;
        private FileHandler warningFile = null;
        private FileHandler fineFile = null;

        private MyLogger(){

            try {
                logFile = new FileHandler(errorLog, true);
                warningFile = new FileHandler(warningLog, true);
                fineFile = new FileHandler(fineLog, true);

            } catch (SecurityException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            logFile.setFormatter(new SimpleFormatter());
            warningFile.setFormatter(new SimpleFormatter());
            fineFile.setFormatter(new SimpleFormatter());

            logger.setLevel(Level.ALL); //log level이 all로 설정되어 있어서 다 나온다.
            fineFile.setLevel(Level.FINE); //더 높은 level을 따라가서 찍음
            warningFile.setLevel(Level.WARNING);

            logger.addHandler(logFile);
            logger.addHandler(warningFile);
            logger.addHandler(fineFile);
        }


        public static MyLogger getLogger(){
            return instance;
        }


        public void log(String msg){

            logger.finest(msg); //error 로그라기 보단 정보를 주기 위한 log, 함수의 시작과 끝에서 log가 찍힘
            logger.finer(msg);
            logger.fine(msg);
            logger.config(msg);
            logger.info(msg);
            logger.warning(msg);
            logger.severe(msg);

        }

        public void fine(String msg){
            logger.fine(msg);
        }

        public void warning(String msg){
            logger.warning(msg);
        }
    }


