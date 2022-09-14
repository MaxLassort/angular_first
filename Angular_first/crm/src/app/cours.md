Différence entre Observable et Subject : 

Un observable envoie tous les données lorsqu'on suscribre
Un subject envoie les données même si personne n'a suscribe, si on suscribre plus tard les données sont déjà envoyés
Un Behavior subject a besoin d'une valeur initiale

Un Observable est unicast, on ne peut y suscribre qu'une seule fois, si on subscribe une seconde fois c'est pour une autre donnée qui est envoyé ex: un Math.random va envoyer deux chiffres différents aux deux sucribes

Un Subject, s'il y a plusieurs suscribe la même donnée va être envoyé plusieurs fois dès qu'un next est lançée ex: pour un Math.random, le même number va être envoyé aux deux suscribes

Le Behavior subject est capable de récupérer au moment de la suscription les données initiales OU les dernières données reçus 
Le ReplaySubject recupère toutes les données (initialisées avant le suscribe) plus les données après le suscribe et est multicast, si je resuscribe le second suscribe récupère l'entièreté des données

