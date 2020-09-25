package org.pratica;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.ITestResult;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Relatorio {

    public static ExtentReports EXTENT_REPORT = null;
    public static ExtentHtmlReporter HTML_REPORTER = null;
    public static ExtentTest TEST;
    public static String reportPath = "target/reports";
    public static String fileName = "TreinamentoAppium_" + getNowDate("yyyy-MM-dd_HH-mm-ss") + ".html" ;

    public static void iniciaRelatorio() {
        createFolderReport();
        EXTENT_REPORT = new ExtentReports();
        HTML_REPORTER = new ExtentHtmlReporter(reportPath+"/"+fileName);
        EXTENT_REPORT.attachReporter(HTML_REPORTER);
    }

    public static void criaTesteRelatorio(String testName) {
        TEST = EXTENT_REPORT.createTest(testName);
    }
    public static void adicionaResultadoTeste(ITestResult result) {
        switch (result.getStatus())
        {
            case ITestResult.FAILURE:
                TEST.log(Status.FAIL, result.getThrowable().toString());
                break;
            case ITestResult.SKIP:
                TEST.log(Status.SKIP, result.getThrowable().toString());
                break;
            default:
                TEST.log(Status.PASS, "Sucesso");
                break;
        }
    }
    public static void geraRelatorio(){
        EXTENT_REPORT.flush();
    }
    public static void gravaInformacaoRelatorio(String mensagem){
        TEST.log(Status.INFO, mensagem);
    }

    @BeforeSuite
    public void oneTimeBefore() {
        Relatorio.iniciaRelatorio();
    }
    public static String getNowDate(String mask){
        DateFormat dateFormat = new SimpleDateFormat(mask);
        Date date = new Date();
        return dateFormat.format(date);
    }
    public static void createFolderReport(){
        File dir = new File(System.getProperty("user.dir") + "\\target\\reports");
        dir.mkdir();
    }



}
