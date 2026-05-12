package com.gabbas.quizapp_gabbas.data;

import java.util.ArrayList;

public class FesQuestions {
    public static ArrayList<Question> getQuestions(String category) {
        ArrayList<Question> questions = new ArrayList<>();
        if (category == null) return questions;

        switch (category) {
            case "Géographie":
                questions.add(new Question("Fès est connue pour être la capitale ... du Maroc ?", new String[]{"Économique", "Spirituelle", "Administrative", "Moderne"}, 1));
                questions.add(new Question("Comment s'appelle la plus ancienne partie de Fès ?", new String[]{"Fès el-Jdid", "Fès el-Bali", "Ville Nouvelle", "Agdal"}, 1));
                questions.add(new Question("Quelle université de Fès est considérée comme la plus ancienne au monde ?", new String[]{"Al Akhawayn", "Al Quaraouiyine", "Sorbonne", "Oxford"}, 1));
                questions.add(new Question("Fès se situe entre quelles montagnes ?", new String[]{"Rif et Moyen Atlas", "Haut Atlas et Anti-Atlas", "Himalaya", "Alpes"}, 0));
                questions.add(new Question("Quel oued traverse la ville de Fès ?", new String[]{"Oued Sebou", "Oued Fès", "Oued Bouregreg", "Oued Moulouya"}, 1));
                questions.add(new Question("Dans quelle région se trouve Fès ?", new String[]{"Fès-Meknès", "Casablanca-Settat", "Rabat-Salé", "Tanger-Tétouan"}, 0));
                questions.add(new Question("Quelle porte monumentale est le symbole de l'entrée de la Médina ?", new String[]{"Bab Mansour", "Bab Boujloud", "Bab Agnaou", "Bab Marrakech"}, 1));
                questions.add(new Question("La médina de Fès est-elle piétonne ?", new String[]{"Oui, la plus grande au monde", "Non", "Seulement le dimanche", "Seulement pour les touristes"}, 0));
                questions.add(new Question("Quel quartier de Fès a été fondé par les Mérinides ?", new String[]{"Fès el-Bali", "Fès el-Jdid", "Ville Nouvelle", "Zouagha"}, 1));
                questions.add(new Question("Fès est célèbre pour son labyrinthe de combien de ruelles environ ?", new String[]{"900", "9000", "500", "2000"}, 1));
                break;

            case "Science":
                questions.add(new Question("Quelle institution de Fès est reconnue par l'UNESCO comme la plus ancienne université ?", new String[]{"Université Sidi Mohamed Ben Abdellah", "Al Quaraouiyine", "Euromed", "Madrassa Bou Inania"}, 1));
                questions.add(new Question("Quel savant célèbre a étudié ou enseigné à Fès ?", new String[]{"Ibn Khaldoun", "Galilée", "Newton", "Einstein"}, 0));
                questions.add(new Question("L'astrolabe était un instrument étudié à Fès au Moyen Âge ?", new String[]{"Vrai", "Faux", "Seulement à Marrakech", "Seulement en Europe"}, 0));
                questions.add(new Question("Quel type de climat caractérise Fès ?", new String[]{"Méditerranéen à influence continentale", "Désertique", "Tropical", "Polaire"}, 0));
                questions.add(new Question("Quelle industrie artisanale de Fès utilise des procédés chimiques ancestraux ?", new String[]{"La tannerie", "La microélectronique", "L'aérospatiale", "La sidérurgie"}, 0));
                questions.add(new Question("Fès est connue pour son savoir-faire dans quel domaine médical ancien ?", new String[]{"Chirurgie", "Pharmacopée traditionnelle", "Radiologie", "Génétique"}, 1));
                questions.add(new Question("Quel médecin et philosophe juif célèbre a vécu à Fès ?", new String[]{"Maïmonide", "Freud", "Hippocrate", "Avicenne"}, 0));
                questions.add(new Question("Les horloges à eau (clepsydres) médiévales de Fès sont célèbres ?", new String[]{"Vrai", "Faux", "Seulement au Japon", "Seulement en Grèce"}, 0));
                break;

            case "Sport":
                questions.add(new Question("Quel est le grand club de football de Fès ?", new String[]{"WAC", "MAS Fès", "Raja", "AS FAR"}, 1));
                questions.add(new Question("Quel autre club de Fès a évolué en première division ?", new String[]{"WAF", "IRT", "HUSA", "MAT"}, 0));
                questions.add(new Question("Comment s'appelle le grand stade de Fès ?", new String[]{"Stade Mohammed V", "Complexe sportif de Fès", "Stade de Marrakech", "Stade Adrar"}, 1));
                questions.add(new Question("Les couleurs du Maghreb de Fès (MAS) sont ?", new String[]{"Vert et Blanc", "Jaune et Noir", "Rouge et Blanc", "Bleu et Blanc"}, 1));
                questions.add(new Question("En quelle année le MAS a-t-il remporté la Coupe de la CAF ?", new String[]{"2000", "2011", "2015", "2020"}, 1));
                questions.add(new Question("Le MAS de Fès possède également une grande section de quel sport ?", new String[]{"Rugby", "Basketball", "Hockey", "Escrime"}, 1));
                questions.add(new Question("Quel stade historique plus petit se trouve en ville ?", new String[]{"Stade Hassan II", "Stade Bernabéu", "Stade de France", "Camp Nou"}, 0));
                questions.add(new Question("Fès a-t-elle déjà accueilli des matchs de l'équipe nationale ?", new String[]{"Oui", "Non", "Jamais", "Seulement en amical"}, 0));
                break;

            case "Films":
                questions.add(new Question("Le film 'L'Homme qui en savait trop' a des scènes à Fès ?", new String[]{"Oui", "Non", "Seulement à Marrakech", "Seulement à Casa"}, 1));
                questions.add(new Question("Fès a servi de décor pour représenter quelle ville dans certains films ?", new String[]{"Bagdad", "Paris", "New York", "Londres"}, 0));
                questions.add(new Question("Un film de la saga 'Indiana Jones' a été tourné en partie à Fès ?", new String[]{"Oui", "Non", "Seulement en Égypte", "Seulement en Jordanie"}, 0));
                questions.add(new Question("Quel festival célèbre de Fès attire des documentaristes du monde entier ?", new String[]{"Festival des Musiques Sacrées", "Festival du Film", "Festival de Jazz", "Festival Gnaoua"}, 0));
                questions.add(new Question("Quel film d'action de 2015 avec Tom Cruise a été tourné au Maroc ?", new String[]{"Mission Impossible : Rogue Nation", "Top Gun", "James Bond", "Bourne"}, 0));
                questions.add(new Question("Fès est souvent choisie pour son aspect ... ?", new String[]{"Futuriste", "Authentique et médiéval", "Industriel", "Moderne"}, 1));
                questions.add(new Question("Un film sur la vie de quel prophète a été tourné dans la région ?", new String[]{"Moïse", "Noé", "Abraham", "Jésus"}, 0));
                questions.add(new Question("Les ruelles de Fès sont un décor idéal pour les films de ?", new String[]{"Science-fiction", "Espionnage et aventure", "Comédie musicale", "Western"}, 1));
                break;

            case "Culture générale":
                questions.add(new Question("Qui a fondé la ville de Fès ?", new String[]{"Moulay Idriss Ier / Idriss II", "Yacoub El Mansour", "Moulay Ismaïl", "Hassan II"}, 0));
                questions.add(new Question("Quel chapeau traditionnel porte le nom de la ville ?", new String[]{"Le Sombrero", "Le Fès (Tarbouche)", "Le Béret", "Le Panonma"}, 1));
                questions.add(new Question("Quelle est la spécialité culinaire sucrée-salée de Fès ?", new String[]{"Couscous", "Pastilla au pigeon", "Tanjia", "Harira"}, 1));
                questions.add(new Question("Comment s'appelle le quartier des tanneurs à Fès ?", new String[]{"Chouara", "Gueliz", "Habous", "Marina"}, 0));
                questions.add(new Question("Quelle medersa est célèbre pour son architecture mérinide à Fès ?", new String[]{"Bou Inania", "Ben Youssef", "Tinmel", "Hassan II"}, 0));
                questions.add(new Question("Le bleu de Fès est une couleur utilisée en ?", new String[]{"Peinture", "Céramique/Poterie", "Tissage", "Sculpture"}, 1));
                questions.add(new Question("Fès est inscrite au patrimoine mondial de l'UNESCO depuis ?", new String[]{"1981", "1995", "2001", "2010"}, 0));
                questions.add(new Question("Le quartier des Andalous a été fondé par des réfugiés de ?", new String[]{"Espagne (Cordoue)", "Tunisie (Kairouan)", "Égypte", "France"}, 0));
                break;
        }
        return questions;
    }
}