@echo off
if "%OS%" == "Windows_NT" setlocal
rem ---------------------------------------------------------------------------
rem Start Execution for Recipe Finder
rem ---------------------------------------------------------------------------
java -jar %~dp0RecipeFinder.jar%*
pause;