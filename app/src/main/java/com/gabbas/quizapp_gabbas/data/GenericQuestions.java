package com.gabbas.quizapp_gabbas.data;

import java.util.ArrayList;

public class GenericQuestions {
    public static ArrayList<Question> getQuestions(String category) {
        ArrayList<Question> questions = new ArrayList<>();
        if (category == null) return questions;

        switch (category) {
            case "Géographie":
                questions.add(new Question("Quel est le plus grand continent par superficie ?", new String[]{"Afrique", "Asie", "Amérique du Nord", "Europe"}, 1));
                questions.add(new Question("Quel fleuve est le plus long du monde ?", new String[]{"Amazone", "Nil", "Mississippi", "Yangtsé"}, 1));
                questions.add(new Question("Quel pays possède la plus grande population ?", new String[]{"Inde", "Chine", "États-Unis", "Indonésie"}, 0));
                questions.add(new Question("Quelle est la capitale de la France ?", new String[]{"Londres", "Berlin", "Paris", "Rome"}, 2));
                questions.add(new Question("Quel océan est le plus vaste ?", new String[]{"Atlantique", "Indien", "Pacifique", "Arctique"}, 2));
                questions.add(new Question("Quel est le plus haut sommet du monde ?", new String[]{"K2", "Mont Blanc", "Everest", "Kilimandjaro"}, 2));
                questions.add(new Question("Dans quel pays se trouve la Grande Muraille ?", new String[]{"Japon", "Corée", "Chine", "Thaïlande"}, 2));
                questions.add(new Question("Quel pays est surnommé le Pays du Soleil Levant ?", new String[]{"Chine", "Japon", "Australie", "Brésil"}, 1));
                break;

            case "Science":
                questions.add(new Question("Quelle est la planète la plus proche du Soleil ?", new String[]{"Vénus", "Terre", "Mars", "Mercure"}, 3));
                questions.add(new Question("Quel est le symbole chimique de l'eau ?", new String[]{"CO2", "H2O", "O2", "NaCl"}, 1));
                questions.add(new Question("Qui a formulé la théorie de la relativité ?", new String[]{"Isaac Newton", "Albert Einstein", "Galilée", "Nikola Tesla"}, 1));
                questions.add(new Question("Quel organe pompe le sang dans le corps humain ?", new String[]{"Poumon", "Cerveau", "Cœur", "Foie"}, 2));
                questions.add(new Question("Quelle est l'unité de mesure de la force ?", new String[]{"Watt", "Joule", "Newton", "Volt"}, 2));
                questions.add(new Question("Quel gaz les plantes absorbent-elles pour la photosynthèse ?", new String[]{"Oxygène", "Azote", "Dioxyde de carbone", "Hydrogène"}, 2));
                questions.add(new Question("Combien de dents possède un adulte moyen ?", new String[]{"28", "30", "32", "34"}, 2));
                questions.add(new Question("Quelle est la vitesse de la lumière (environ) ?", new String[]{"300 000 km/s", "150 000 km/s", "1 000 000 km/s", "50 000 km/s"}, 0));
                break;

            case "Sport":
                questions.add(new Question("Tous les combien d'années ont lieu les Jeux Olympiques d'été ?", new String[]{"2 ans", "4 ans", "6 ans", "10 ans"}, 1));
                questions.add(new Question("Quel sport est associé à Wimbledon ?", new String[]{"Football", "Rugby", "Tennis", "Golf"}, 2));
                questions.add(new Question("Combien de joueurs y a-t-il dans une équipe de football sur le terrain ?", new String[]{"9", "10", "11", "12"}, 2));
                questions.add(new Question("Quel pays a remporté la Coupe du Monde de Football 2018 ?", new String[]{"Brésil", "Allemagne", "France", "Argentine"}, 2));
                questions.add(new Question("Dans quel sport utilise-t-on un palet (puck) ?", new String[]{"Basketball", "Hockey sur glace", "Handball", "Baseball"}, 1));
                questions.add(new Question("Qui est souvent considéré comme le 'Roi' du football ?", new String[]{"Maradona", "Pelé", "Zidane", "Messi"}, 1));
                questions.add(new Question("Quelle est la distance d'un marathon ?", new String[]{"21 km", "42,195 km", "10 km", "100 km"}, 1));
                questions.add(new Question("Quel pilote de F1 détient le record de 7 titres mondiaux (avec Hamilton) ?", new String[]{"Alain Prost", "Michael Schumacher", "Ayrton Senna", "Sebastian Vettel"}, 1));
                break;

            case "Films":
                questions.add(new Question("Qui a réalisé le film 'Jurassic Park' ?", new String[]{"James Cameron", "Steven Spielberg", "Christopher Nolan", "Martin Scorsese"}, 1));
                questions.add(new Question("Quel film d'animation met en scène Simba ?", new String[]{"Toy Story", "Le Roi Lion", "Aladdin", "Shrek"}, 1));
                questions.add(new Question("Dans 'Star Wars', qui est le père de Luke Skywalker ?", new String[]{"Obi-Wan Kenobi", "Dark Vador", "Yoda", "Palpatine"}, 1));
                questions.add(new Question("Quel film a remporté l'Oscar du meilleur film en 2020 ?", new String[]{"1917", "Parasite", "Joker", "The Irishman"}, 1));
                questions.add(new Question("Quel acteur incarne Jack Sparrow ?", new String[]{"Brad Pitt", "Johnny Depp", "Tom Cruise", "Leonardo DiCaprio"}, 1));
                questions.add(new Question("Comment s'appelle l'IA dans '2001, l'Odyssée de l'espace' ?", new String[]{"Jarvis", "HAL 9000", "Skynet", "Cortana"}, 1));
                questions.add(new Question("Quel est le premier long-métrage d'animation de Disney ?", new String[]{"Cendrillon", "Blanche-Neige et les Sept Nains", "Pinocchio", "Bambi"}, 1));
                questions.add(new Question("Qui joue le rôle principal dans 'Mission Impossible' ?", new String[]{"Will Smith", "Tom Cruise", "Matt Damon", "Jason Statham"}, 1));
                break;

            case "Culture générale":
                questions.add(new Question("Qui a peint la Joconde ?", new String[]{"Claude Monet", "Vincent van Gogh", "Léonard de Vinci", "Pablo Picasso"}, 2));
                questions.add(new Question("Quelle est la capitale de l'Italie ?", new String[]{"Milan", "Naples", "Venise", "Rome"}, 3));
                questions.add(new Question("En quelle année a débuté la Seconde Guerre mondiale ?", new String[]{"1914", "1939", "1945", "1918"}, 1));
                questions.add(new Question("Quel est le plus grand mammifère terrestre ?", new String[]{"Rhinocéros", "Hippopotame", "Éléphant d'Afrique", "Girafe"}, 2));
                questions.add(new Question("Quel pays a offert la Statue de la Liberté aux États-Unis ?", new String[]{"Royaume-Uni", "Allemagne", "France", "Espagne"}, 2));
                questions.add(new Question("Qui a écrit 'Les Misérables' ?", new String[]{"Émile Zola", "Victor Hugo", "Gustave Flaubert", "Albert Camus"}, 1));
                questions.add(new Question("Quelle langue est la plus parlée au monde ?", new String[]{"Anglais", "Chinois Mandarin", "Espagnol", "Hindi"}, 0));
                questions.add(new Question("Quel est l'instrument de musique à vent le plus courant ?", new String[]{"Piano", "Violon", "Flûte", "Guitare"}, 2));
                break;
        }
        return questions;
    }
}