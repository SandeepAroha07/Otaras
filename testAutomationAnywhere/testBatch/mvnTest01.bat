cd C:\mywork\seleniumgit\munivisorautomatedtestSelenium\testAutomationAnywhere
mvn test -Durl="http://10.0.3.14:8081" -DsuiteXmlFile=trialtestsuite.xml -Dcomplexity="smoke"   -Dheadlessflag="yes"
pause