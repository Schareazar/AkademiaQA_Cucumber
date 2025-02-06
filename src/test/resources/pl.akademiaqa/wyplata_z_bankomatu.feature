# language: pl

  Właściwość: Wypłata z bankomatu

    Użytkownik powinien móc wypłacić pieniądze z bankomatu

  Scenariusz:
    Zakładając, że użytkownik posiada 1000 złotych na koncie
    Gdy użytkownik spróbuje wypłacić 100 złotych z bankomatu
    Wtedy bankomat wypłaci 100 złotych użytkownikowi
    Oraz saldo konta zmieni się na 900 złotych