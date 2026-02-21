public class Report {
    private String content;

    public Report(String content) {
        this.content = content;
    }

    public void export() {
        System.out.println(content);
    }
}
