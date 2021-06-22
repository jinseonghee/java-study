package ch11;

public class MakeReport {

    StringBuffer buffer = new StringBuffer(); // String 을 쓸때 '+'와 같은 의미 -> 글자를 붙여 쓸 수 있게 함.

    private String line = "===========================================\n";
    private String title = "  이름\t   주소 \t\t  전화번호  \n";
    private void makeHeader()
    {
        buffer.append(line);  // append 는 문자열을 계속 추가하는 함수
        buffer.append(title);
        buffer.append(line);
    }

    private void generateBody()
    {
        buffer.append("James \t");
        buffer.append("Seoul Korea \t");
        buffer.append("010-2222-3333\n");

        buffer.append("Tomas \t");
        buffer.append("NewYork US \t\t");
        buffer.append("010-7777-0987\n");
    }

    private void makeFooter()
    {

        buffer.append(line);
    }

    public String getReport()
    {
        makeHeader();
        generateBody();
        makeFooter();
        return buffer.toString();
    }
}
