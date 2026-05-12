package com.gabbas.quizapp_gabbas.data;

import java.util.ArrayList;

public class RabatQuestions {
    public static ArrayList<Question> getQuestions(String category) {
        ArrayList<Question> questions = new ArrayList<>();
        if (category == null) return questions;

        switch (category) {
            case "Géographie":
                questions.add(new Question("Rabat est la capitale de quel pays ?", new String[]{"Algérie", "Maroc", "Tunisie", "Sénégal"}, 1));
                questions.add(new Question("Quel fleuve sépare Rabat de Salé ?", new String[]{"Oum Er-Rbia", "Sebou", "Bouregreg", "Moulouya"}, 2));
                questions.add(new Question("Quel monument historique domine l'embouchure du Bouregreg ?", new String[]{"Tour Hassan", "Kasbah des Oudayas", "Chellah", "Mausolée Mohammed V"}, 1));
                questions.add(new Question("Rabat est située sur quel océan ?", new String[]{"Indien", "Pacifique", "Atlantique", "Arctique"}, 2));
                questions.add(new Question("Comment appelle-t-on les habitants de Rabat ?", new String[]{"Rabati", "Rbati", "Rabatéens", "Casablancais"}, 1));
                questions.add(new Question("Quelle ville est la jumelle de Rabat, séparée par un fleuve ?", new String[]{"Kénitra", "Salé", "Témara", "Mohammedia"}, 1));
                questions.add(new Question("Le site antique de Chellah se trouve à ?", new String[]{"Marrakech", "Fès", "Rabat", "Meknès"}, 2));
                questions.add(new Question("Rabat fait partie de quelle région ?", new String[]{"Rabat-Salé-Kénitra", "Casablanca-Settat", "Fès-Meknès", "Tanger-Tétouan"}, 0));
                questions.add(new Question("Quelle forêt célèbre se trouve aux abords de Rabat ?", new String[]{"Forêt de Maâmora", "Forêt d'Ifrane", "Forêt de l'Arganeraie", "Forêt de Sherwood"}, 0));
                break;

            case "Science":
                questions.add(new Question("Où se trouve le siège de l'Académie du Royaume du Maroc ?", new String[]{"Casablanca", "Fès", "Rabat", "Marrakech"}, 2));
                questions.add(new Question("Quelle université célèbre est basée à Rabat ?", new String[]{"Université Al Akhawayn", "Université Mohammed V", "Université Hassan II", "Université Cadi Ayyad"}, 1));
                questions.add(new Question("Le jardin d'essais botaniques de Rabat est classé au patrimoine mondial ?", new String[]{"Oui", "Non", "En cours", "Seulement national"}, 0));
                questions.add(new Question("Quel type de climat a Rabat ?", new String[]{"Désertique", "Méditerranéen", "Tropical", "Polaire"}, 1));
                questions.add(new Question("L'Agence Spatiale Marocaine a des bureaux à Rabat ?", new String[]{"Vrai", "Faux", "Non, à Ouarzazate", "Non, à Tanger"}, 0));
                questions.add(new Question("Quelle institution de recherche agronomique est basée à Rabat ?", new String[]{"INRA", "NASA", "CNRS", "CERN"}, 0));
                questions.add(new Question("Le pont à haubans Mohammed VI se trouve près de ?", new String[]{"Casablanca", "Rabat", "Marrakech", "Tanger"}, 1));
                questions.add(new Question("Quel institut de santé publique majeur est basé à Rabat ?", new String[]{"Institut Pasteur", "Institut National d'Hygiène", "OMS", "Croix-Rouge"}, 1));
                break;

            case "Sport":
                questions.add(new Question("Quel est le club de football historique de Rabat ?", new String[]{"WAC", "RCA", "AS FAR", "FUS Rabat"}, 2));
                questions.add(new Question("Le FUS est un club de quelle ville ?", new String[]{"Fès", "Rabat", "Salé", "Tanger"}, 1));
                questions.add(new Question("Comment s'appelle le grand stade de Rabat ?", new String[]{"Stade Mohammed V", "Stade Moulay Abdellah", "Stade de Marrakech", "Stade Ibn Batouta"}, 1));
                questions.add(new Question("Quel club de Rabat est lié aux Forces Armées Royales ?", new String[]{"FUS", "AS FAR", "Stade Marocain", "IRT"}, 1));
                questions.add(new Question("Rabat a-t-elle accueilli la Coupe du Monde des Clubs ?", new String[]{"Oui", "Non", "Jamais", "Une seule fois"}, 0));
                questions.add(new Question("Le Meeting international Mohammed VI d'athlétisme a lieu à ?", new String[]{"Casablanca", "Rabat", "Marrakech", "Tanger"}, 1));
                questions.add(new Question("Les couleurs de l'AS FAR sont ?", new String[]{"Vert et Blanc", "Rouge, Noir et Vert", "Bleu et Jaune", "Blanc et Rouge"}, 1));
                questions.add(new Question("Quel sport est pratiqué sur le Bouregreg ?", new String[]{"Ski", "Aviron", "Alpinisme", "Cricket"}, 1));
                break;

            case "Films":
                questions.add(new Question("Le film 'Mission Impossible: Rogue Nation' a-t-il été tourné à Rabat ?", new String[]{"Oui", "Non", "Seulement à Casa", "Seulement à Tanger"}, 0));
                questions.add(new Question("Où se trouve le Centre Cinématographique Marocain (CCM) ?", new String[]{"Casablanca", "Ouarzazate", "Rabat", "Marrakech"}, 2));
                questions.add(new Question("Quel quartier de Rabat ressemble à un décor de film ?", new String[]{"Agdal", "Oudayas", "Hay Riad", "Youssoufia"}, 1));
                questions.add(new Question("Le festival international du film d'auteur a lieu à ?", new String[]{"Marrakech", "Tanger", "Rabat", "Agadir"}, 2));
                questions.add(new Question("Rabat est souvent utilisée pour représenter des villes ?", new String[]{"Européennes", "Moyen-Orientales", "Américaines", "Asiatiques"}, 1));
                questions.add(new Question("Le film 'Black Hawk Down' a utilisé des décors à Rabat-Salé ?", new String[]{"Oui", "Non", "Seulement en Somalie", "Seulement aux USA"}, 0));
                questions.add(new Question("Quelle salle de cinéma est historique dans le centre de Rabat ?", new String[]{"Renaissance", "Megarama", "Imax", "Pathé"}, 0));
                questions.add(new Question("Le film 'Body of Lies' a été tourné en partie à ?", new String[]{"Casablanca", "Rabat", "Tanger", "Fès"}, 1));
                break;

            case "Culture générale":
                questions.add(new Question("Quel souverain a ordonné la construction de la Tour Hassan ?", new String[]{"Mohammed V", "Yacoub El Mansour", "Moulay Ismaïl", "Hassan II"}, 1));
                questions.add(new Question("Le Mausolée Mohammed V abrite les tombes de quels rois ?", new String[]{"Mohammed V et Hassan II", "Moulay Ismaïl", "Mohammed VI", "Yacoub El Mansour"}, 0));
                questions.add(new Question("Quel est le festival de musique géant qui a lieu à Rabat ?", new String[]{"Gnaoua", "Mawazine", "Jazzablanca", "Timitar"}, 1));
                questions.add(new Question("Comment s'appelle le grand théâtre moderne de Rabat ?", new String[]{"Théâtre Royal", "Grand Théâtre de Rabat", "Théâtre Mohammed V", "Ciné Atlas"}, 1));
                questions.add(new Question("Rabat est classée au patrimoine mondial de l'UNESCO depuis ?", new String[]{"1990", "2005", "2012", "2020"}, 2));
                questions.add(new Question("La rue des Consuls se trouve dans ?", new String[]{"L'Agdal", "La Médina", "Hay Riad", "Souissi"}, 1));
                questions.add(new Question("Quel monument est le symbole inachevé de Rabat ?", new String[]{"Tour Mohammed VI", "Tour Hassan", "Minaret de la Koutoubia", "Tour Eiffel"}, 1));
                questions.add(new Question("Le Palais Royal de Rabat est aussi appelé ?", new String[]{"Dar al-Makhzen", "Elysée", "White House", "Alhambra"}, 0));
                break;
        }
        return questions;
    }
}