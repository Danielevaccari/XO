TicTacToe 

Tämä projekti on java ohjelmointikielellä toteutettu ristinolla peli, joka on pelattavissa ASCII-merkeillä päätteessä.


**Asennusohjeet**

1. Tarkista että sinulla on java koneellasi: java -version

2. Kloonaa projekti omalle koneelle menemällä kansioon johon haluat sijoittaa projektin ja käyttämällä komentoa:

git clone https://gitlab.utu.fi/djvacc/tictactoe.git

3. Kloonauksen jälkeen avaa Eclipse tai jokin muu kehitysympäristö ja avaa projekti kehitysympäristön kautta.

Open file -> kansio johon kloonasit projektin -> Open



**Käyttöohjeet**

Asennuksen jälkeen Pelaaminen aloitetaan TicTacToe luokan main-metodista

1. Peli kysyy pelataanko yksin- vai kaksinpeliä, johon pelaaja syöttää kokonaisluvun 1 tai 2 (1 meinaa yksinpeliä ja 2 kaksinpeliä).

2. Peli kysyy pelaajan/pelaajien nimeä riippuen valittiinko yksin- vai kaksinpeli.

3. Peli kysyy mihin sijoitetaan X, jonka jälkeen pelaaja syöttää kokonaisluvun väliltä [1-9] (Peli tulostaa pelilaudan indeksoinnin pelaajan avuksi).

4. Peli kysyy mihin sijoitetaan O, -||-. Nappuloiden sijoitus jatkuu vuoroperiaatteella kunnes jompikumpi voittaa tai tulee tasapeli.

