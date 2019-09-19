set mypath=%cd%
@echo %mypath%
java -Dwebdriver.chrome.driver=%mypath%\chromedriver.exe -jar selenium-server-standalone-3.12.0.jar -role webdriver -hub http://localhost:4444/grid/register -port 6662 -browser browserName=chrome