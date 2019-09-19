set projectLocation=C:\mywork\AUTOMATION\NEW\testAutomationAnywhere

cd %projectLocation%

set classpath=%projectLocation%\target\test-classes\;%projectLocation%\target\classes\;%projectLocation%\lib\*

java org.testng.TestNG %projectLocation%\TestSuites\Ford\SeqFromTestdataFuncTestcmd.xml

pause