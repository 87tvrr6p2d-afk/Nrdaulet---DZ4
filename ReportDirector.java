public class ReportDirector {

    public void construct(IReportBuilder builder) {
        builder.setHeader("Annual Report");
        builder.setContent("Report Content Here");
        builder.setFooter("Confidential");
    }
}
