public class TextReportBuilder implements IReportBuilder {

    private StringBuilder sb = new StringBuilder();

    public void setHeader(String header) {
        sb.append("HEADER: ").append(header).append("\n");
    }

    public void setContent(String content) {
        sb.append("CONTENT: ").append(content).append("\n");
    }

    public void setFooter(String footer) {
        sb.append("FOOTER: ").append(footer).append("\n");
    }

    public Report getReport() {
        return new Report(sb.toString());
    }
}
