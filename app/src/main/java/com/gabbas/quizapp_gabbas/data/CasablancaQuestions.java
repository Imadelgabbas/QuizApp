package com.gabbas.quizapp_gabbas.data;

import java.util.ArrayList;

public class CasablancaQuestions {
    public static ArrayList<Question> getQuestions(String category) {
        ArrayList<Question> questions = new ArrayList<>();
        if (category == null) return questions;

        switch (category) {
            case "Géographie":
                questions.add(new Question("Quelle est la plus grande ville du Maroc ?", new String[]{"Rabat", "Marrakech", "Casablanca", "Tanger"}, 2));
                questions.add(new Question("Quelle ville marocaine est connue comme capitale économique ?", new String[]{"Fès", "Casablanca", "Agadir", "Oujda"}, 1));
                questions.add(new Question("Quel océan borde Casablanca ?", new String[]{"Indien", "Pacifique", "Atlantique", "Arctique"}, 2));
                questions.add(new Question("Quelle grande mosquée se trouve à Casablanca ?", new String[]{"Koutoubia", "Hassan II", "Hassan", "Al Quaraouiyine"}, 1));
                questions.add(new Question("Casablanca se trouve dans quel pays ?", new String[]{"Tunisie", "Algérie", "Maroc", "Égypte"}, 2));
                questions.add(new Question("Quel est l'ancien nom de Casablanca ?", new String[]{"Anfa", "Mazagan", "Tingis", "Sala"}, 0));
                questions.add(new Question("Dans quelle région se situe Casablanca ?", new String[]{"Rabat-Salé", "Casablanca-Settat", "Fès-Meknès", "Souss-Massa"}, 1));
                questions.add(new Question("Quel climat domine à Casablanca ?", new String[]{"Désertique", "Méditerranéen", "Tropical", "Polaire"}, 1));
                questions.add(new Question("Quel port de Casablanca est l'un des plus grands d'Afrique ?", new String[]{"Port d'Anvers", "Port de Marseille", "Port de Casablanca", "Port de Tanger Med"}, 2));
                questions.add(new Question("Casablanca est située sur quel plateau ?", new String[]{"Saïs", "Haouz", "Chaouia", "Gharb"}, 2));
                break;

            case "Sport":
                questions.add(new Question("Quel club célèbre est basé à Casablanca ?", new String[]{"Raja CA", "AS FAR", "FUS Rabat", "IRT Tanger"}, 0));
                questions.add(new Question("Quel autre grand club de football est basé à Casablanca ?", new String[]{"MAS Fès", "Wydad AC", "HUSA Agadir", "MAT Tétouan"}, 1));
                questions.add(new Question("Dans quelle ville se trouve le Complexe Mohammed V ?", new String[]{"Rabat", "Marrakech", "Casablanca", "Fès"}, 2));
                questions.add(new Question("Casablanca est connue pour quel derby ?", new String[]{"Derby de Madrid", "Derby de Casablanca", "Derby de Milan", "Derby de Londres"}, 1));
                questions.add(new Question("Quel sport est le plus populaire à Casablanca ?", new String[]{"Tennis", "Basketball", "Football", "Handball"}, 2));
                questions.add(new Question("Quelles sont les couleurs du Raja CA ?", new String[]{"Rouge et Blanc", "Vert et Blanc", "Bleu et Blanc", "Jaune et Noir"}, 1));
                questions.add(new Question("Quelles sont les couleurs du Wydad AC ?", new String[]{"Rouge et Blanc", "Vert et Blanc", "Bleu et Blanc", "Noir et Blanc"}, 0));
                questions.add(new Question("Quel quartier de Casa abrite le complexe Mohammed V ?", new String[]{"Maârif", "Anfa", "Oasis", "Bourgone"}, 0));
                questions.add(new Question("Quel club de Casablanca a remporté la Ligue des Champions de la CAF en 2022 ?", new String[]{"Raja", "Wydad", "SCCM", "TAS"}, 1));
                questions.add(new Question("Le Raja de Casablanca est surnommé le club du ... ?", new String[]{"Peuple", "Roi", "Désert", "Nord"}, 0));
                break;

            case "Culture générale":
                questions.add(new Question("Quel est l’ancien nom de Casablanca ?", new String[]{"Tingis", "Anfa", "Sala", "Lixus"}, 1));
                questions.add(new Question("Casablanca est connue comme quelle capitale du Maroc ?", new String[]{"Administrative", "Culturelle", "Économique", "Religieuse"}, 2));
                questions.add(new Question("Quelle mosquée est un symbole de Casablanca ?", new String[]{"Hassan II", "Koutoubia", "Tinmel", "Al Quaraouiyine"}, 0));
                questions.add(new Question("Casablanca est une ville côtière : vrai ou faux ?", new String[]{"Vrai", "Faux", "Seulement l'hiver", "Seulement l'été"}, 0));
                questions.add(new Question("Casablanca appartient à quelle région ?", new String[]{"Rabat-Salé", "Casablanca-Settat", "Fès-Meknès", "Souss-Massa"}, 1));
                questions.add(new Question("Quel quartier historique est connu pour son architecture Habous ?", new String[]{"Gueliz", "Agdal", "Habous", "Anfa"}, 2));
                questions.add(new Question("Quel monument possède un minaret de 210 mètres ?", new String[]{"Tour Hassan", "Mosquée Hassan II", "Koutoubia", "Burj Khalifa"}, 1));
                questions.add(new Question("Quel centre d'affaires est le symbole moderne de Casa ?", new String[]{"Twin Center", "Technopark", "Marina", "CFC"}, 0));
                questions.add(new Question("Quelle promenade est célèbre au bord de l'eau ?", new String[]{"La Marina", "La Corniche", "Le Bouregreg", "Le Croisette"}, 1));
                questions.add(new Question("Quelle est la monnaie utilisée à Casablanca ?", new String[]{"Euro", "Dollar", "Dirham", "Dinar"}, 2));
                break;

            case "Science":
                questions.add(new Question("Quel climat domine à Casablanca ?", new String[]{"Désertique", "Tropical", "Méditerranéen", "Polaire"}, 2));
                questions.add(new Question("Casablanca utilise quelle source d'eau majeure ?", new String[]{"Le Nil", "Oum Er-Rbia", "L'Amazone", "Le Rhin"}, 1));
                questions.add(new Question("La mosquée Hassan II est bâtie en partie sur l'eau ?", new String[]{"Oui", "Non", "Dans le désert", "Sur une montagne"}, 0));
                questions.add(new Question("Casablanca est située sur quel plateau ?", new String[]{"Saïs", "Chaouia", "Haouz", "Gharb"}, 1));
                questions.add(new Question("Quelle institution scientifique est basée à Casablanca ?", new String[]{"NASA", "CERN", "Université Hassan II", "Institut Pasteur"}, 2));
                questions.add(new Question("Quelle est la principale activité industrielle de Casa ?", new String[]{"Agriculture", "Transformation et services", "Pêche artisanale", "Tourisme de montagne"}, 1));
                questions.add(new Question("Quel port gère l'essentiel du commerce marocain ?", new String[]{"Port de Safi", "Port de Casablanca", "Port de Nador", "Port d'Agadir"}, 1));
                questions.add(new Question("Casablanca possède-t-elle un tramway électrique ?", new String[]{"Oui", "Non", "En projet", "Seulement le métro"}, 0));
                questions.add(new Question("Quel centre de recherche en biotechnologie est situé à Casablanca ?", new String[]{"Technopark", "MASCIR", "NASA", "CNRS"}, 1));
                questions.add(new Question("Casablanca abrite le siège de quelle agence de régulation des télécoms ?", new String[]{"ANRT", "NASA", "ARCEP", "FCC"}, 0));
                break;

            case "Films":
                questions.add(new Question("Quel film hollywoodien célèbre porte le nom de Casablanca ?", new String[]{"Titanic", "Avatar", "Casablanca", "Inception"}, 2));
                questions.add(new Question("Où a été tourné l'essentiel du film 'Casablanca' (1942) ?", new String[]{"Au Maroc", "À Hollywood", "À Londres", "À Paris"}, 1));
                questions.add(new Question("Qui est l'acteur principal du film 'Casablanca' ?", new String[]{"Brad Pitt", "Humphrey Bogart", "Tom Cruise", "Clark Gable"}, 1));
                questions.add(new Question("L'actrice Ingrid Bergman joue dans quel film lié à la ville ?", new String[]{"Casablanca", "Titanic", "Avatar", "Star Wars"}, 0));
                questions.add(new Question("Comment s'appelle le café célèbre inspiré du film ?", new String[]{"Starbucks", "Rick's Café", "Café Hafa", "Café de Paris"}, 1));
                questions.add(new Question("En quelle année est sorti le film 'Casablanca' ?", new String[]{"1930", "1942", "1956", "1960"}, 1));
                questions.add(new Question("Quelle chanson célèbre est jouée dans le film 'Casablanca' ?", new String[]{"Imagine", "As Time Goes By", "Yesterday", "My Way"}, 1));
                questions.add(new Question("Le film 'Casablanca' a gagné l'Oscar du meilleur film ?", new String[]{"Oui", "Non", "Nommé seulement", "Annulé"}, 0));
                questions.add(new Question("Quel réalisateur a dirigé le film 'Casablanca' ?", new String[]{"Steven Spielberg", "Michael Curtiz", "Alfred Hitchcock", "James Cameron"}, 1));
                questions.add(new Question("Quel acteur français célèbre a tourné dans le quartier des Habous pour un film ?", new String[]{"Jean Reno", "Gérard Depardieu", "Omar Sy", "Alain Delon"}, 0));
                break;
        }
        return questions;
    }
}