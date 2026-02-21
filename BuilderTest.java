ReportDirector director = new ReportDirector();
IReportBuilder builder = new TextReportBuilder();

director.construct(builder);
Report report = builder.getReport();
report.export();
