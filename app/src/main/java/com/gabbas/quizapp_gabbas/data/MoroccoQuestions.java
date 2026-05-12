package com.gabbas.quizapp_gabbas.data;

import java.util.ArrayList;

public class MoroccoQuestions {
    public static ArrayList<Question> getQuestions(String category) {
        ArrayList<Question> questions = new ArrayList<>();
        if (category == null) return questions;

        switch (category) {
            case "Géographie":
                questions.add(new Question("Quelle est la capitale du Maroc ?", new String[]{"Casablanca", "Rabat", "Marrakech", "Fès"}, 1));
                questions.add(new Question("Quel massif montagneux traverse le centre du Maroc ?", new String[]{"Le Rif", "L'Atlas", "Les Alpes", "Les Pyrénées"}, 1));
                questions.add(new Question("Quelle ville est surnommée la 'Perle du Sud' ?", new String[]{"Agadir", "Marrakech", "Ouarzazate", "Laâyoune"}, 1));
                questions.add(new Question("Quel pays borde le Maroc à l'est ?", new String[]{"Tunisie", "Algérie", "Mauritanie", "Libye"}, 1));
                questions.add(new Question("Quel détroit sépare le Maroc de l'Espagne ?", new String[]{"Détroit d'Ormuz", "Détroit de Gibraltar", "Détroit de Magellan", "Détroit de Sicile"}, 1));
                questions.add(new Question("Quelle est la plus grande ville du Maroc ?", new String[]{"Rabat", "Casablanca", "Tanger", "Fès"}, 1));
                questions.add(new Question("Quelle ville est connue pour ses maisons bleues ?", new String[]{"Chefchaouen", "Essaouira", "Ifrane", "Oujda"}, 0));
                questions.add(new Question("Le Maroc est bordé par quel océan à l'ouest ?", new String[]{"Indien", "Pacifique", "Atlantique", "Arctique"}, 2));
                questions.add(new Question("Quelle ville marocaine est une enclave espagnole ?", new String[]{"Nador", "Melilla", "Tétouan", "Larache"}, 1));
                questions.add(new Question("Quel est le point culminant du Maroc ?", new String[]{"Mont Toubkal", "M'Goun", "Oukaïmeden", "Sirwa"}, 0));
                break;

            case "Science":
                questions.add(new Question("Quelle plante marocaine produit une huile très rare ?", new String[]{"Olivier", "Arganier", "Palmier", "Cactus"}, 1));
                questions.add(new Question("Quelle ville est connue comme la 'Petite Suisse' du Maroc ?", new String[]{"Azrou", "Ifrane", "Midelt", "Béni Mellal"}, 1));
                questions.add(new Question("Le Maroc est l'un des plus grands exportateurs mondiaux de ?", new String[]{"Pétrole", "Phosphates", "Or", "Diamants"}, 1));
                questions.add(new Question("Quelle centrale solaire marocaine est l'une des plus grandes au monde ?", new String[]{"Noor Ouarzazate", "Solaris", "Helios", "Sahara Sun"}, 0));
                questions.add(new Question("Quelle mer borde le nord du Maroc ?", new String[]{"Mer Rouge", "Mer Méditerranée", "Mer Noire", "Mer Morte"}, 1));
                questions.add(new Question("Le courant marin qui longe les côtes marocaines s'appelle ?", new String[]{"Gulf Stream", "Courant des Canaries", "El Niño", "Kuroshio"}, 1));
                questions.add(new Question("Quel type de désert couvre une grande partie du sud du Maroc ?", new String[]{"Gobi", "Sahara", "Kalahari", "Atacama"}, 1));
                questions.add(new Question("Comment s'appelle le vent chaud venant du désert ?", new String[]{"Mistral", "Sirocco / Chergui", "Alizé", "Mousson"}, 1));
                break;

            case "Sport":
                questions.add(new Question("En quelle année le Maroc a-t-il atteint les demi-finales de la Coupe du Monde ?", new String[]{"2018", "2022", "1986", "1998"}, 1));
                questions.add(new Question("Quel coureur marocain détient le record du monde du 1500m ?", new String[]{"Said Aouita", "Hicham El Guerrouj", "Soufiane El Bakkali", "Nawal El Moutawakel"}, 1));
                questions.add(new Question("Quel est le surnom de l'équipe nationale de football du Maroc ?", new String[]{"Les Aigles", "Les Lions de l'Atlas", "Les Fennecs", "Les Éléphants"}, 1));
                questions.add(new Question("Quelle ville accueillera la finale de la Coupe du Monde 2030 (projet) ?", new String[]{"Casablanca", "Rabat", "Tanger", "Marrakech"}, 0));
                questions.add(new Question("Qui est la première femme africaine championne olympique (400m haies) ?", new String[]{"Nezha Bidouane", "Nawal El Moutawakel", "Hasna Benhassi", "Mutola"}, 1));
                questions.add(new Question("Quel club marocain a remporté le plus de titres de la Ligue des Champions de la CAF ?", new String[]{"Raja CA", "Wydad AC", "AS FAR", "RS Berkane"}, 0));
                questions.add(new Question("Quel sport est traditionnel lors des moussems (Fantasia) ?", new String[]{"Course de chameaux", "Tbourida (Équitation)", "Lutte", "Tir à l'arc"}, 1));
                questions.add(new Question("Le Maroc a organisé la CAN en quelle année ?", new String[]{"1988", "2004", "2015", "2022"}, 0));
                break;

            case "Films":
                questions.add(new Question("Quelle ville marocaine abrite les plus grands studios de cinéma ?", new String[]{"Marrakech", "Ouarzazate", "Casablanca", "Tanger"}, 1));
                questions.add(new Question("Le film 'Gladiator' a été tourné en grande partie à ?", new String[]{"Rabat", "Aït Ben Haddou", "Fès", "Agadir"}, 1));
                questions.add(new Question("Quel film de la saga 'Star Wars' a utilisé des décors au Maroc ?", new String[]{"Épisode IV", "Épisode I", "Épisode VII", "Aucun"}, 3));
                questions.add(new Question("Quel acteur célèbre a tourné 'Kingdom of Heaven' au Maroc ?", new String[]{"Brad Pitt", "Orlando Bloom", "Tom Cruise", "Johnny Depp"}, 1));
                questions.add(new Question("Le ksar d'Aït Ben Haddou est classé au patrimoine mondial de ?", new String[]{"L'ONU", "L'UNESCO", "L'OMS", "L'UNICEF"}, 1));
                questions.add(new Question("Quel film de James Bond a été tourné à Oujda et Erfoud ?", new String[]{"Skyfall", "Spectre", "Casino Royale", "GoldenEye"}, 1));
                questions.add(new Question("Le film 'Babel' avec Brad Pitt a été tourné dans quelle région ?", new String[]{"Le Nord", "Le Moyen Atlas", "Le Sud (Ouarzazate)", "Casablanca"}, 2));
                questions.add(new Question("Le Festival International du Film de Marrakech a lieu chaque année ?", new String[]{"Vrai", "Faux", "Tous les 2 ans", "Seulement l'été"}, 0));
                break;

            case "Culture générale":
                questions.add(new Question("Qui est l'actuel Roi du Maroc ?", new String[]{"Hassan II", "Mohammed VI", "Moulay Ismaïl", "Mohammed V"}, 1));
                questions.add(new Question("Quelle est la monnaie officielle du Maroc ?", new String[]{"Dinar", "Dirham", "Euro", "Riyal"}, 1));
                questions.add(new Question("Quelle est la langue officielle du Maroc (en plus de l'Arabe) ?", new String[]{"Français", "Amazigh", "Espagnol", "Anglais"}, 1));
                questions.add(new Question("Quel est le plat national du Maroc ?", new String[]{"Paëlla", "Couscous", "Pizza", "Sushi"}, 1));
                questions.add(new Question("De quelle couleur est l'étoile sur le drapeau marocain ?", new String[]{"Rouge", "Verte", "Blanche", "Jaune"}, 1));
                questions.add(new Question("En quelle année le Maroc a obtenu son indépendance ?", new String[]{"1945", "1956", "1962", "1975"}, 1));
                questions.add(new Question("Quelle dynastie règne actuellement sur le Maroc ?", new String[]{"Mérinide", "Alaouite", "Saadienne", "Almohade"}, 1));
                questions.add(new Question("Comment s'appelle le vêtement traditionnel à capuche ?", new String[]{"Kaftan", "Djellaba", "Gandoura", "Tarbouche"}, 1));
                questions.add(new Question("Quelle est la fête qui marque la fin du Ramadan ?", new String[]{"Aïd al-Adha", "Aïd al-Fitr", "Achoura", "Mawlid"}, 1));
                questions.add(new Question("Quel est l'emblème floral non officiel du Maroc ?", new String[]{"La Rose (de Kelâat M'Gouna)", "Le Jasmin", "La Lavande", "Le Lys"}, 0));
                break;
        }
        return questions;
    }
}