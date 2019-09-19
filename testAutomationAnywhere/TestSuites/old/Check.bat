set projectLocation=C:\SVNstart\testAutomationAnywhere

cd %projectLocation%

set classpath=%projectLocation%\target\test-classes\;%projectLocation%\lib\*

java org.testng.TestNG %projectLocation%\Framework.xml

pause