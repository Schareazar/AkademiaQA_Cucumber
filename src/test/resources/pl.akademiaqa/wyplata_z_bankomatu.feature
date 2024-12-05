# language: pl

  Właściwość: Wypłata z bankomatu

    Użytkownik powinien móc wypłacić pieniądze z bankomatu

  Scenariusz:
    Zakładając, że użytkownik posiada 1000 zł na koncie
    Gdy użytkownik spróbuje wypłacić 100 zł z bankomatu
    Wtedy bankomat wypłaci 100 zł użytkownikowi
    Oraz saldo konta zmieni się na 900 zł