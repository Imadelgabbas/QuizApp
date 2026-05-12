package com.gabbas.quizapp_gabbas.data;

import java.util.ArrayList;

public class MarrakechQuestions {
    public static ArrayList<Question> getQuestions(String category) {
        ArrayList<Question> questions = new ArrayList<>();
        if (category == null) return questions;

        switch (category) {
            case "Géographie":
                questions.add(new Question("Marrakech est surnommée la ville ... ?", new String[]{"Blanche", "Rouge", "Bleue", "Verte"}, 1));
                questions.add(new Question("Quelle chaîne de montagnes borde Marrakech ?", new String[]{"Rif", "Atlas", "Himalaya", "Andes"}, 1));
                questions.add(new Question("Marrakech se trouve dans quelle plaine ?", new String[]{"Gharb", "Haouz", "Saïs", "Chaouia"}, 1));
                questions.add(new Question("Quel est le point culminant près de Marrakech ?", new String[]{"Toubkal", "Everest", "Mont Blanc", "Kilimandjaro"}, 0));
                questions.add(new Question("Quel désert de pierres se trouve près de Marrakech ?", new String[]{"Sahara", "Agafay", "Gobi", "Atacama"}, 1));
                questions.add(new Question("Dans quelle région se situe Marrakech ?", new String[]{"Casablanca-Settat", "Marrakech-Safi", "Souss-Massa", "Rabat-Salé"}, 1));
                questions.add(new Question("Quel oued traverse la palmeraie de Marrakech ?", new String[]{"Sebou", "Tensift", "Moulouya", "Draâ"}, 1));
                questions.add(new Question("La ville est divisée en deux parties : la Médina et ... ?", new String[]{"Le centre", "Guéliz", "L'Agdal", "L'Hivernage"}, 1));
                questions.add(new Question("Quel jardin célèbre a été créé par un peintre français ?", new String[]{"Jardin Majorelle", "Jardin des Tuileries", "Jardin d'Essai", "Menara"}, 0));
                questions.add(new Question("Comment appelle-t-on le bassin d'eau entouré d'oliviers ?", new String[]{"Majorelle", "Menara", "Agdal", "Koutoubia"}, 1));
                break;

            case "Science":
                questions.add(new Question("Quel type de climat règne à Marrakech ?", new String[]{"Méditerranéen", "Semi-aride", "Tropical", "Polaire"}, 1));
                questions.add(new Question("Quelle université historique se trouve à Marrakech ?", new String[]{"Al Akhawayn", "Cadi Ayyad", "Mohammed V", "Al Quaraouiyine"}, 1));
                questions.add(new Question("Le jardin Majorelle contient une grande collection de ?", new String[]{"Roses", "Cactus", "Palmiers", "Tulipes"}, 1));
                questions.add(new Question("Comment s'appelle le système d'irrigation traditionnel à Marrakech ?", new String[]{"Canal", "Khettara", "Barrage", "Puits"}, 1));
                questions.add(new Question("La ville est connue pour son architecture en ?", new String[]{"Verre", "Terre et brique (pisé)", "Acier", "Marbre blanc"}, 1));
                questions.add(new Question("L'Observatoire de l'Oukaïmeden est spécialisé en ?", new String[]{"Botanique", "Astronomie", "Géologie", "Zoologie"}, 1));
                questions.add(new Question("Marrakech a accueilli quelle conférence mondiale sur le climat ?", new String[]{"COP21", "COP22", "COP26", "COP28"}, 1));
                questions.add(new Question("Quel arbre est emblématique de la région ?", new String[]{"Chêne", "Arganier", "Sapin", "Bambou"}, 1));
                break;

            case "Sport":
                questions.add(new Question("Quel est le club de football phare de Marrakech ?", new String[]{"WAC", "Kawkab Marrakech (KACM)", "Raja", "MAS"}, 1));
                questions.add(new Question("Comment s'appelle le grand stade de la ville ?", new String[]{"Stade Mohammed V", "Grand Stade de Marrakech", "Stade Adrar", "Stade d'Honneur"}, 1));
                questions.add(new Question("Quel marathon célèbre a lieu à Marrakech ?", new String[]{"Marathon de Paris", "Marathon International de Marrakech", "Marathon de New York", "Marathon des Sables"}, 1));
                questions.add(new Question("Marrakech est une destination prisée pour quel sport ?", new String[]{"Ski nautique", "Golf", "Hockey sur glace", "Escrime"}, 1));
                questions.add(new Question("Quelle épreuve automobile s'est tenue dans les rues de Marrakech ?", new String[]{"Formule 1", "WTCC / Formule E", "Rallye Dakar", "MotoGP"}, 1));
                questions.add(new Question("Les couleurs du Kawkab Marrakech sont ?", new String[]{"Bleu et Blanc", "Rouge et Blanc", "Vert et Noir", "Jaune et Bleu"}, 1));
                questions.add(new Question("Quel événement équestre a lieu au Royal Polo Club ?", new String[]{"Course de chameaux", "Polo", "Rodéo", "Saut d'obstacles"}, 1));
                questions.add(new Question("La station de ski près de Marrakech s'appelle ?", new String[]{"Ifrane", "Oukaïmeden", "Michlifen", "Tazekka"}, 1));
                break;

            case "Films":
                questions.add(new Question("Quel festival de cinéma se tient chaque année à Marrakech ?", new String[]{"Cannes", "FIFM (Festival International du Film)", "Oscars", "Berlinale"}, 1));
                questions.add(new Question("Quel film d'Alfred Hitchcock a été tourné à Marrakech ?", new String[]{"Psychose", "L'Homme qui en savait trop", "Les Oiseaux", "Vertigo"}, 1));
                questions.add(new Question("Le film 'Gladiator' a-t-il utilisé les studios près de Marrakech ?", new String[]{"Oui", "Non", "Seulement à Rome", "Seulement à Londres"}, 0));
                questions.add(new Question("Quel film de la saga 'Sex and the City' a été tourné à Marrakech ?", new String[]{"Le premier", "Le deuxième", "Le troisième", "Aucun"}, 1));
                questions.add(new Question("La place Jemaa el-Fna apparaît dans de nombreux films ?", new String[]{"Vrai", "Faux", "Interdit de filmer", "Seulement les documentaires"}, 0));
                questions.add(new Question("Où se trouvent les célèbres studios de cinéma près de la ville ?", new String[]{"À Tanger", "À Ouarzazate", "À Agadir", "À Rabat"}, 1));
                questions.add(new Question("Quel acteur a présidé le jury du festival de Marrakech en 2023 ?", new String[]{"Mads Mikkelsen", "Jessica Chastain", "Brad Pitt", "Robert De Niro"}, 1));
                questions.add(new Question("Le film 'Mission Impossible: Rogue Nation' a une scène à Marrakech ?", new String[]{"Oui", "Non", "Seulement à Londres", "Seulement à Dubaï"}, 0));
                break;

            case "Culture générale":
                questions.add(new Question("Quelle est la place la plus célèbre de Marrakech ?", new String[]{"Place Rouge", "Jemaa el-Fna", "Place de la Concorde", "Place de la Bourse"}, 1));
                questions.add(new Question("Quel minaret est le symbole de Marrakech ?", new String[]{"Tour Hassan", "Koutoubia", "Eiffel", "Giralda"}, 1));
                questions.add(new Question("Marrakech a été fondée par quelle dynastie ?", new String[]{"Alaouite", "Almoravide", "Idrisside", "Mérinide"}, 1));
                questions.add(new Question("Quel plat est la spécialité culinaire de Marrakech ?", new String[]{"Couscous", "Tanjia", "Tajine aux pruneaux", "Pastilla"}, 1));
                questions.add(new Question("Comment s'appelle le quartier des artisans ?", new String[]{"Le centre-ville", "Les Souks", "La Marina", "Le Port"}, 1));
                questions.add(new Question("Les tombeaux de quelle dynastie sont un site touristique ?", new String[]{"Alaouite", "Saadiens", "Mérinides", "Wattassides"}, 1));
                questions.add(new Question("Quel palais est surnommé 'Le Palais de la Belle' ?", new String[]{"Palais El Badi", "Palais de la Bahia", "Palais Royal", "Palais de l'Elysée"}, 1));
                questions.add(new Question("Quel type de thé est offert en signe de bienvenue ?", new String[]{"Thé noir", "Thé à la menthe", "Thé glacé", "Café au lait"}, 1));
                questions.add(new Question("Marrakech est inscrite au patrimoine mondial de ?", new String[]{"L'ONU", "L'UNESCO", "L'OMS", "L'UNICEF"}, 1));
                questions.add(new Question("Quel vêtement traditionnel est souvent porté à Marrakech ?", new String[]{"Sari", "Djellaba", "Kimono", "Toge"}, 1));
                break;
        }
        return questions;
    }
}