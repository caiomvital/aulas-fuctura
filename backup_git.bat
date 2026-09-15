@echo off
:: Navega ate a pasta correta das suas aulas
cd "C:\Users\Caio\OneDrive\Desktop\Aulas"

:: Captura a data atual no formato DD/MM/AAAA
for /f "tokens=1-3 delims=/ " %%a in ('date /t') do (set mydate=%%a/%%b/%%c)

:: Executa os comandos do Git
git add .
git commit -m "Atualizacao dia %mydate%"
git push origin main
