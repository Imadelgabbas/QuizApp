package com.gabbas.quizapp_gabbas.data;

import java.util.ArrayList;

public class TangerQuestions {
    public static ArrayList<Question> getQuestions(String category) {
        ArrayList<Question> questions = new ArrayList<>();
        if (category == null) return questions;

        switch (category) {
            case "Géographie":
                questions.add(new Question("Tanger est située sur quel détroit ?", new String[]{"Détroit de Gibraltar", "Détroit de Messine", "Détroit de Magellan", "Détroit d'Ormuz"}, 0));
                questions.add(new Question("Quels deux plans d'eau se rejoignent à Tanger ?", new String[]{"Méditerranée et Atlantique", "Mer Rouge et Océan Indien", "Mer Noire et Mer Caspienne", "Manche et Mer du Nord"}, 0));
                questions.add(new Question("Quelle ville espagnole est visible depuis Tanger par temps clair ?", new String[]{"Madrid", "Barcelone", "Tarifa", "Malaga"}, 2));
                questions.add(new Question("Comment appelle-t-on le cap le plus au nord de l'Afrique près de Tanger ?", new String[]{"Cap Spartel", "Cap Vert", "Cap Horn", "Cap de Bonne-Espérance"}, 0));
                questions.add(new Question("Dans quelle région se trouve Tanger ?", new String[]{"Tanger-Tétouan-Al Hoceïma", "Casablanca-Settat", "Oriental", "Souss-Massa"}, 0));
                questions.add(new Question("Tanger est surnommée la ville ... ?", new String[]{"Blanche", "Bleue", "Rouge", "Verte"}, 0));
                questions.add(new Question("Quel port moderne est l'un des plus grands d'Afrique ?", new String[]{"Port de Casablanca", "Tanger Med", "Port d'Alger", "Port de Tunis"}, 1));
                questions.add(new Question("Les Grottes d'Hercule se situent près de quelle ville ?", new String[]{"Marrakech", "Rabat", "Tanger", "Agadir"}, 2));
                break;

            case "Science":
                questions.add(new Question("Quel phénomène maritime unique se produit au détroit de Gibraltar ?", new String[]{"Rencontre de deux courants", "Tsunami permanent", "Eau douce en surface", "Gel de la mer"}, 0));
                questions.add(new Question("Quel climat domine à Tanger ?", new String[]{"Méditerranéen avec influence atlantique", "Désertique", "Tropical humide", "Polaire"}, 0));
                questions.add(new Question("Le vent célèbre qui souffle à Tanger s'appelle ?", new String[]{"Sirocco", "Chergui", "Levant", "Mistral"}, 2));
                questions.add(new Question("Tanger est-elle une zone de forte activité sismique ?", new String[]{"Oui", "Non", "Jamais", "Seulement au sud"}, 0));
                questions.add(new Question("Quelle source d'énergie renouvelable est très présente près de Tanger ?", new String[]{"Solaire", "Éolienne", "Géothermique", "Nucléaire"}, 1));
                break;

            case "Sport":
                questions.add(new Question("Quel est le club de football phare de Tanger ?", new String[]{"IRT Tanger", "MAT Tétouan", "WAC", "RCA"}, 0));
                questions.add(new Question("Comment s'appelle le grand stade de Tanger ?", new String[]{"Stade Ibn Batouta", "Stade Mohammed V", "Stade Moulay Abdellah", "Stade Adrar"}, 0));
                questions.add(new Question("Les couleurs de l'Ittihad de Tanger (IRT) sont ?", new String[]{"Vert et Blanc", "Bleu et Blanc", "Rouge et Blanc", "Jaune et Noir"}, 1));
                questions.add(new Question("Tanger a-t-elle accueilli le Trophée des Champions français ?", new String[]{"Oui", "Non", "En projet", "Jamais"}, 0));
                questions.add(new Question("Quel sport nautique est très pratiqué sur les plages de Tanger ?", new String[]{"Surf", "Planche à voile / Kitesurf", "Plongée sous-marine", "Water-polo"}, 1));
                break;

            case "Films":
                questions.add(new Question("Quel film de James Bond a été tourné en partie à Tanger ?", new String[]{"Skyfall", "Spectre / Tuer n'est pas jouer", "Goldfinger", "Casino Royale"}, 1));
                questions.add(new Question("Le film 'Inception' a des scènes censées se passer à Mombassa mais tournées à ?", new String[]{"Casablanca", "Tanger", "Marrakech", "Rabat"}, 1));
                questions.add(new Question("Quel film de la saga 'Jason Bourne' a une célèbre course-poursuite à Tanger ?", new String[]{"La Mémoire dans la peau", "La Vengeance dans la peau", "La Mort dans la peau", "Jason Bourne"}, 1));
                questions.add(new Question("Le film 'Only Lovers Left Alive' se déroule en grande partie à ?", new String[]{"Paris", "Tanger", "Londres", "Détroit"}, 1));
                questions.add(new Question("Tanger était le lieu de résidence de quel écrivain de la 'Beat Generation' adapté au cinéma ?", new String[]{"Jack Kerouac", "William S. Burroughs", "Allen Ginsberg", "Charles Bukowski"}, 1));
                break;

            case "Culture générale":
                questions.add(new Question("Quel célèbre voyageur et explorateur est né à Tanger ?", new String[]{"Marco Polo", "Ibn Battuta", "Christophe Colomb", "Vasco de Gama"}, 1));
                questions.add(new Question("Pendant une partie du XXe siècle, Tanger avait un statut spécial appelé ?", new String[]{"Zone Libre", "Zone Internationale", "Protectorat", "Colonie"}, 1));
                questions.add(new Question("Comment s'appelle le café mythique surplombant la mer ?", new String[]{"Rick's Café", "Café Hafa", "Café de Paris", "Café des Nattes"}, 1));
                questions.add(new Question("La Librairie des Colonnes est un lieu culturel célèbre de ?", new String[]{"Rabat", "Casablanca", "Tanger", "Fès"}, 2));
                questions.add(new Question("Quelle langue, en plus de l'arabe et du français, est très parlée à Tanger ?", new String[]{"Anglais", "Espagnol", "Allemand", "Italien"}, 1));
                questions.add(new Question("Le Grand Socco est une place située à ?", new String[]{"Marrakech", "Tanger", "Agadir", "Meknès"}, 1));
                questions.add(new Question("Quel peintre célèbre a été fasciné par la lumière de Tanger ?", new String[]{"Picasso", "Matisse", "Van Gogh", "Dalí"}, 1));
                questions.add(new Question("Le palais du Sultan à Tanger abrite aujourd'hui quel musée ?", new String[]{"Musée de la Kasbah", "Musée d'Art Contemporain", "Musée de la Musique", "Musée de l'Eau"}, 0));
                break;
        }
        return questions;
    }
}