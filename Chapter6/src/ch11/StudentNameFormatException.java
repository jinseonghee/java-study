package ch11;

public class StudentNameFormatException extends IllegalArgumentException{ //그냥 Exception이 아닌 IllegalArgumentException을 해주면 throws를 안해도 Exception 핸들링이 가능

    public StudentNameFormatException(String message) {
        super(message);
    }
}
