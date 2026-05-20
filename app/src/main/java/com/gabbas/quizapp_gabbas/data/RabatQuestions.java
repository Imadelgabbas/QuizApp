package com.gabbas.quizapp_gabbas.data;

import static com.gabbas.quizapp_gabbas.data.QuestionFactory.easy;
import static com.gabbas.quizapp_gabbas.data.QuestionFactory.hard;
import static com.gabbas.quizapp_gabbas.data.QuestionFactory.medium;

import java.util.ArrayList;

public class RabatQuestions {

    public static ArrayList<Question> getQuestions(String category) {
        ArrayList<Question> questions = new ArrayList<>();
        if (category == null) {
            return questions;
        }

        switch (category) {
            case "Géographie":
                addGeographyQuestions(questions);
                break;
            case "Science":
                addScienceQuestions(questions);
                break;
            case "Sport":
                addSportQuestions(questions);
                break;
            case "Films":
                addFilmQuestions(questions);
                break;
            case "Culture générale":
                addCultureQuestions(questions);
                break;
            default:
                break;
        }

        return questions;
    }

    private static void addGeographyQuestions(ArrayList<Question> questions) {
        questions.add(easy("Rabat est la capitale de quel pays ?", 1, "Algérie", "Maroc", "Tunisie", "Sénégal"));
        questions.add(easy("Quel fleuve sépare Rabat de Salé ?", 2, "Oum Er-Rbia", "Sebou", "Bouregreg", "Moulouya"));
        questions.add(easy("Rabat est située sur quel océan ?", 2, "Indien", "Pacifique", "Atlantique", "Arctique"));
        questions.add(easy("Quelle ville est jumelée à Rabat par le fleuve Bouregreg ?", 1, "Kénitra", "Salé", "Témara", "Mohammedia"));
        questions.add(easy("Rabat fait partie de quelle région ?", 0, "Rabat-Salé-Kénitra", "Casablanca-Settat", "Fès-Meknès", "Souss-Massa"));
        questions.add(easy("Le site antique de Chellah se trouve dans quelle ville ?", 2, "Marrakech", "Fès", "Rabat", "Meknès"));
        questions.add(new Question("Quel mausolée royal blanc se trouve à Rabat ?", new String[]{"Mausolée de Moulay Ismaïl", "Mausolée Mohammed V", "Tombeau Saadien", "Sépulcre Idrisside"}, 1, "EASY"));
        questions.add(new Question("Quel site archéologique majeur se visite près du centre de Rabat ?", new String[]{"Aït Ben Haddou", "Volubilis", "Chellah", "Lixus"}, 2, "EASY"));

        questions.add(medium("Quel monument historique domine l'embouchure du Bouregreg ?", 1, "Tour Hassan", "Kasbah des Oudayas", "Chellah", "Mausolée Mohammed V"));
        questions.add(medium("Quelle forêt célèbre se trouve aux abords de Rabat ?", 0, "Forêt de Maâmora", "Forêt d'Ifrane", "Forêt de Tazekka", "Forêt d'Azrou"));
        questions.add(medium("Quel monument inachevé domine la silhouette historique de Rabat ?", 1, "Tour Mohammed VI", "Tour Hassan", "Minaret Koutoubia", "Phare d'El Hank"));
        questions.add(medium("Quelle ville côtière se trouve au sud de Rabat ?", 2, "Salé", "Kénitra", "Témara", "Larache"));
        questions.add(medium("Sur quelle rive du Bouregreg se trouve Rabat ?", 0, "La rive sud", "La rive nord", "La rive est", "La rive ouest"));
        questions.add(medium("Quel ancien nom romain est associé au site de Chellah ?", 3, "Volubilis", "Lixus", "Tingis", "Sala Colonia"));
        questions.add(new Question("Quel quartier résidentiel et diplomatique se trouve au sud de Rabat ?", new String[]{"Souissi", "Bourgogne", "Sidi Moumen", "Maarif"}, 0, "MEDIUM"));
        questions.add(new Question("Quelle gare ferroviaire moderne dessert le sud de Rabat ?", new String[]{"Rabat Centre", "Rabat-Agdal", "Casa-Port", "Salé Ville"}, 1, "MEDIUM"));

        questions.add(hard("Quel jardin borde la Kasbah des Oudayas ?", 2, "Jardin Majorelle", "Jardin de la Ménara", "Jardins andalous", "Jardin Harti"));
        questions.add(hard("Quel quartier abrite traditionnellement le palais royal de Rabat ?", 1, "Agdal", "Touarga", "Souissi", "Youssoufia"));
        questions.add(hard("Quel monument se trouve entre la Tour Hassan et le Bouregreg ?", 0, "Le Mausolée Mohammed V", "Le Grand Théâtre", "Le CCM", "La Marina"));
        questions.add(new Question("Quel projet d'aménagement a transformé les berges du fleuve entre Rabat et Salé ?", new String[]{"Projet Anfa", "Vallée du Bouregreg", "Plan Saïss", "Tanger Tech"}, 1, "HARD"));
    }

    private static void addScienceQuestions(ArrayList<Question> questions) {
        questions.add(easy("Quelle université célèbre est basée à Rabat ?", 1, "Université Al Akhawayn", "Université Mohammed V", "Université Hassan II", "Université Cadi Ayyad"));
        questions.add(easy("Quel type de climat a Rabat ?", 1, "Désertique", "Méditerranéen", "Tropical", "Polaire"));
        questions.add(easy("Quelle institution de recherche agronomique est basée à Rabat ?", 0, "INRA", "NASA", "CNRS", "CERN"));
        questions.add(easy("Quel institut de santé publique majeur est basé à Rabat ?", 1, "Institut Pasteur de Lille", "Institut National d'Hygiène", "OMS Europe", "Croix-Rouge"));
        questions.add(easy("Où se trouve le siège de l'Académie du Royaume du Maroc ?", 2, "Casablanca", "Fès", "Rabat", "Marrakech"));
        questions.add(easy("Le pont Mohammed VI se trouve près de quelle ville ?", 1, "Casablanca", "Rabat", "Agadir", "Tanger"));
        questions.add(new Question("Rabat possède-t-elle un tramway électrique partagé avec Salé ?", new String[]{"Oui", "Non", "Seulement un métro", "Seulement des bus"}, 0, "EASY"));
        questions.add(new Question("Quel grand hôpital universitaire est associé à la faculté de médecine de Rabat ?", new String[]{"CHU Ibn Rochd", "CHU Hassan II", "CHU Ibn Sina", "CHU Mohammed VI"}, 2, "EASY"));

        questions.add(medium("Quel grand centre national de recherche scientifique est installé à Rabat ?", 2, "MASCIR Oujda", "ANRT", "CNRST", "IRESEN Tanger"));
        questions.add(medium("Quelle école d'ingénieurs emblématique se trouve à Madinat Al Irfane à Rabat ?", 0, "EMI", "ENIM", "ENSA Oujda", "EHTP Settat"));
        questions.add(medium("Quel institut vétérinaire et agronomique est basé à Rabat ?", 1, "ENA Meknès", "IAV Hassan II", "ENA Fès", "ENCG Rabat"));
        questions.add(medium("Le quartier universitaire Madinat Al Irfane accueille surtout quels établissements ?", 3, "Des ports", "Des usines textiles", "Des stades", "Des facultés et écoles"));
        questions.add(medium("Quelle institution scientifique historique conserve des collections naturalistes à Rabat ?", 2, "Musée Nejjarine", "Dar Batha", "Institut Scientifique", "Villa des Arts"));
        questions.add(medium("Quelle spécialité est associée au laboratoire national de santé publique à Rabat ?", 1, "Astronomie", "Hygiène et analyses", "Agriculture marine", "Transport aérien"));
        questions.add(new Question("Quel grand campus regroupe EMI, INSEA et d'autres écoles à Rabat ?", new String[]{"Hay Riad", "Madinat Al Irfane", "Touarga", "Ocean"}, 1, "MEDIUM"));
        questions.add(new Question("Quel établissement forme notamment des statisticiens et économistes publics à Rabat ?", new String[]{"INSEA", "ISCAE Agadir", "ENSA Fès", "EST Oujda"}, 0, "MEDIUM"));

        questions.add(hard("Quel centre de recherche marocain travaille notamment sur l'innovation et les matériaux avancés à Rabat ?", 0, "MASCIR", "ONCF Lab", "MASEN", "Lydec Research"));
        questions.add(hard("Quel est le nom du grand campus administratif et universitaire moderne de Rabat ?", 3, "Anfa Park", "Casa Nearshore", "Tanger Tech", "Madinat Al Irfane"));
        questions.add(hard("Le pont Mohammed VI est de quel type structurel ?", 2, "Pont suspendu", "Pont en arc", "Pont à haubans", "Pont flottant"));
        questions.add(new Question("Que signifient les initiales EMI de la grande école d'ingénieurs de Rabat ?", new String[]{"École Maghrébine d'Informatique", "Établissement des Métiers Industriels", "École Mohammadia d'Ingénieurs", "École Moderne d'Innovation"}, 2, "HARD"));
    }

    private static void addSportQuestions(ArrayList<Question> questions) {
        questions.add(easy("Quel est le club de football historique de Rabat lié à l'armée ?", 1, "FUS Rabat", "AS FAR", "Stade Marocain", "CODM"));
        questions.add(easy("Le FUS est un club de quelle ville ?", 1, "Fès", "Rabat", "Salé", "Tanger"));
        questions.add(easy("Comment s'appelle le grand stade de Rabat ?", 1, "Stade Mohammed V", "Stade Moulay Abdellah", "Stade de Marrakech", "Stade Ibn Battouta"));
        questions.add(easy("Le Meeting international Mohammed VI d'athlétisme a lieu à ?", 1, "Casablanca", "Rabat", "Marrakech", "Tanger"));
        questions.add(easy("Quel sport se pratique souvent sur le Bouregreg ?", 1, "Ski", "Aviron", "Hockey", "Escalade"));
        questions.add(easy("Rabat a-t-elle accueilli la Coupe du monde des clubs ?", 0, "Oui", "Non", "Jamais", "Seulement en projet"));
        questions.add(new Question("Quel club rabati joue traditionnellement en rouge et blanc ?", new String[]{"AS FAR", "FUS Rabat", "MAS Fès", "IRT Tanger"}, 1, "EASY"));
        questions.add(new Question("Quel fleuve permet aussi la pratique de l'aviron à Rabat ?", new String[]{"Sebou", "Tensift", "Bouregreg", "Drâa"}, 2, "EASY"));

        questions.add(medium("Les couleurs traditionnelles de l'AS FAR incluent principalement ?", 1, "Bleu et blanc", "Rouge, noir et vert", "Jaune et noir", "Blanc et violet"));
        questions.add(medium("Que signifient les initiales FUS ?", 0, "Fath Union Sport", "Football Union Salé", "Fédération Universitaire Sportive", "Formation Unie du Stade"));
        questions.add(medium("Quel club de Rabat a remporté la Coupe de la CAF en 2010 ?", 0, "FUS Rabat", "AS FAR", "Stade Marocain", "Union Touarga"));
        questions.add(medium("Quel club de Rabat a gagné la Ligue des champions africaine en 1985 ?", 1, "FUS Rabat", "AS FAR", "Raja CA", "Wydad AC"));
        questions.add(medium("Quel stade accueille régulièrement de grands événements d'athlétisme à Rabat ?", 2, "Stade Père Jégo", "Stade El Bachir", "Complexe Moulay Abdellah", "Complexe de Fès"));
        questions.add(medium("Quelle discipline internationale est aussi associée au centre Moulay Abdellah ?", 3, "Ski alpin", "Surf", "Rugby à 13", "Athlétisme"));
        questions.add(new Question("Quel club de Rabat est souvent surnommé les Militaires ?", new String[]{"FUS Rabat", "AS FAR", "Union Touarga", "Stade Marocain"}, 1, "MEDIUM"));
        questions.add(new Question("Quel stade de Rabat a accueilli la CAN féminine en 2022 ?", new String[]{"Stade Adrar", "Stade Ibn Battouta", "Complexe Moulay Abdellah", "Stade d'Honneur d'Oujda"}, 2, "MEDIUM"));

        questions.add(hard("Quel club rabati est historiquement lié aux Forces Armées Royales ?", 2, "FUS", "Racing de Rabat", "AS FAR", "Union Touarga"));
        questions.add(hard("Quel événement mondial féminin de football a eu lieu à Rabat en 2022 ?", 1, "Mondial U20", "CAN féminine", "Euro féminin", "Ligue des nations"));
        questions.add(hard("Quel autre grand équipement sportif moderne complète l'offre de Rabat avec des salles couvertes et annexes ?", 0, "Le complexe Prince Moulay Abdellah", "Le stade d'Honneur d'Oujda", "Le stade Adrar", "Le Grand Stade de Tétouan"));
        questions.add(new Question("Quel club de Rabat a remporté le championnat du Maroc de football en 2016 ?", new String[]{"AS FAR", "Raja CA", "FUS Rabat", "Wydad AC"}, 2, "HARD"));
    }

    private static void addFilmQuestions(ArrayList<Question> questions) {
        questions.add(easy("Où se trouve le Centre Cinématographique Marocain (CCM) ?", 2, "Casablanca", "Ouarzazate", "Rabat", "Marrakech"));
        questions.add(easy("Le film Mission Impossible: Rogue Nation a-t-il utilisé Rabat comme décor ?", 0, "Oui", "Non", "Seulement Casablanca", "Seulement Tanger"));
        questions.add(easy("Quel quartier de Rabat ressemble souvent à un décor de cinéma historique ?", 1, "Agdal", "Kasbah des Oudayas", "Hay Riad", "Souissi"));
        questions.add(easy("Quelle salle de cinéma est historique dans le centre de Rabat ?", 0, "Renaissance", "Imax Rabat", "Pathé Agdal", "Le Colisée de Tanger"));
        questions.add(easy("Rabat est souvent utilisée pour représenter des villes de quelle région du monde à l'écran ?", 1, "Europe du Nord", "Moyen-Orient", "Océanie", "Amérique du Sud"));
        questions.add(easy("Le film Body of Lies a été tourné en partie à ?", 1, "Casablanca", "Rabat", "Tétouan", "Meknès"));
        questions.add(new Question("Quel quartier fortifié de Rabat sert souvent de décor historique au cinéma ?", new String[]{"Hay Riad", "Kasbah des Oudayas", "Yacoub El Mansour", "Akkari"}, 1, "EASY"));
        questions.add(new Question("Quel site antique de Rabat est souvent filmé dans les documentaires patrimoniaux ?", new String[]{"Chellah", "Morocco Mall", "Casa-Port", "Borj Fès"}, 0, "EASY"));

        questions.add(medium("Quel organisme public marocain encadre la production cinématographique depuis Rabat ?", 2, "ONCF", "MAP", "CCM", "ANRT"));
        questions.add(medium("Quel grand festival musical de Rabat attire aussi stars et caméras du monde entier ?", 1, "Jazzablanca", "Mawazine", "Gnaoua", "Timitar"));
        questions.add(medium("Le film Black Hawk Down a utilisé des décors dans la région de Rabat-Salé ?", 0, "Oui", "Non", "Seulement au Sahara", "Seulement à Tanger"));
        questions.add(medium("Quel film d'espionnage avec Russell Crowe et Leonardo DiCaprio a utilisé Rabat ?", 1, "American Gangster", "Body of Lies", "The Insider", "Gladiator"));
        questions.add(medium("Quel intérêt offre Rabat aux réalisateurs de films politiques ou d'espionnage ?", 3, "Ses stations de ski", "Ses vignobles", "Ses temples mayas", "Ses décors officiels et historiques"));
        questions.add(medium("Quel type de bâtiments rend Rabat crédible dans les thrillers géopolitiques ?", 0, "Palais, remparts et ministères", "Pyramides de verre", "Rizières", "Chantiers miniers"));
        questions.add(new Question("Quel fleuve offre des plans panoramiques entre Rabat et Salé dans plusieurs tournages ?", new String[]{"Le Drâa", "Le Bouregreg", "Le Tensift", "Le Loukkos"}, 1, "MEDIUM"));
        questions.add(new Question("Quel grand théâtre moderne peut apparaître dans des plans contemporains de Rabat ?", new String[]{"Théâtre Mohammed V", "Opéra du Caire", "Grand Théâtre de Rabat", "Cinéma Renaissance"}, 2, "MEDIUM"));

        questions.add(hard("Quel quartier fortifié de Rabat surplombe l'embouchure du Bouregreg et apparaît souvent à l'image ?", 1, "Médina moderne", "Kasbah des Oudayas", "Youssoufia", "Akkari"));
        questions.add(hard("Quelle fonction du CCM en fait un acteur clé du cinéma marocain ?", 2, "Il gère les stades", "Il édite les journaux", "Il régule et soutient le secteur", "Il produit uniquement des séries TV"));
        questions.add(hard("Quel élément architectural de Rabat donne une dimension monumentale aux plans de films historiques ?", 0, "La Tour Hassan", "Le Twin Center", "Le Morocco Mall", "Le port de pêche"));
        questions.add(new Question("Quel organisme public délivre notamment des autorisations et soutiens au tournage depuis Rabat ?", new String[]{"ONCF", "CCM", "ADM", "ONDA"}, 1, "HARD"));
    }

    private static void addCultureQuestions(ArrayList<Question> questions) {
        questions.add(easy("Quel souverain a ordonné la construction de la Tour Hassan ?", 1, "Mohammed V", "Yacoub El Mansour", "Moulay Ismaïl", "Hassan II"));
        questions.add(easy("Quel festival de musique géant a lieu à Rabat ?", 1, "Gnaoua", "Mawazine", "Jazzablanca", "Timitar"));
        questions.add(easy("Rabat est classée au patrimoine mondial de l'UNESCO depuis ?", 2, "1990", "2005", "2012", "2020"));
        questions.add(easy("Le Palais Royal de Rabat est aussi appelé comment ?", 0, "Dar al-Makhzen", "Elysée", "Alhambra", "Bardo"));
        questions.add(easy("La rue des Consuls se trouve dans quel secteur historique ?", 1, "Agdal", "La Médina", "Hay Riad", "Souissi"));
        questions.add(easy("Quel théâtre historique porte le nom d'un roi marocain à Rabat ?", 2, "Théâtre Royal", "Grand Théâtre", "Théâtre Mohammed V", "Cinéma Renaissance"));
        questions.add(new Question("Quel mausolée blanc abrite la tombe de Mohammed V à Rabat ?", new String[]{"Mausolée Mohammed V", "Tombeau des Saadiens", "Qoubba almoravide", "Koubba Ba'adiyn"}, 0, "EASY"));
        questions.add(new Question("Quel site antique et médiéval se visite près du centre de Rabat ?", new String[]{"Aït Ben Haddou", "Chellah", "Hercule", "Lixus"}, 1, "EASY"));

        questions.add(medium("Le Mausolée Mohammed V abrite les tombes de quels souverains ?", 0, "Mohammed V et Hassan II", "Moulay Ismaïl et Hassan Ier", "Mohammed VI et Hassan II", "Yacoub El Mansour et Mohammed V"));
        questions.add(medium("Comment s'appelle le grand théâtre moderne de Rabat conçu par Zaha Hadid ?", 1, "Théâtre National Hassan", "Grand Théâtre de Rabat", "Opéra du Bouregreg", "Maison des Arts"));
        questions.add(medium("Quelle nécropole antique et médiévale se visite à Rabat ?", 2, "Volubilis", "Lixus", "Chellah", "Bab Agnaou"));
        questions.add(medium("Quel portail historique de Rabat est devenu un lieu d'exposition ?", 0, "Bab Rouah", "Bab Marrakech", "Bab Doukkala", "Bab El Had"));
        questions.add(medium("Quel quartier historique bleu et blanc domine l'océan à Rabat ?", 3, "Souissi", "Agdal", "Touarga", "Kasbah des Oudayas"));
        questions.add(medium("Quel espace vert est célèbre à l'intérieur de la Kasbah des Oudayas ?", 2, "Jardin Harti", "Jardin Majorelle", "Jardins andalous", "Jardin de la Ménara"));
        questions.add(new Question("Quel musée national d'art moderne et contemporain se trouve à Rabat ?", new String[]{"Musée Batha", "Villa des Arts de Fès", "Musée Mohammed VI", "Musée Nejjarine"}, 2, "MEDIUM"));
        questions.add(new Question("Quel quartier de Rabat est connu pour ses ambassades et grandes résidences ?", new String[]{"Souissi", "Médina", "Kasbah", "Mellah de Fès"}, 0, "MEDIUM"));

        questions.add(hard("La Tour Hassan était initialement destinée à quelle fonction ?", 1, "Palais royal", "Minaret d'une immense mosquée", "Observatoire", "Porte fortifiée"));
        questions.add(hard("Quel monument ultra-moderne dialogue visuellement avec la vieille ville depuis la vallée du Bouregreg ?", 0, "Le Grand Théâtre de Rabat", "Le Morocco Mall", "Le Twin Center", "La tour Eiffel"));
        questions.add(hard("Quel titre UNESCO complet désigne Rabat dans son inscription officielle ?", 2, "Ville rouge moderne", "Capitale impériale et port", "Capitale moderne et ville historique", "Ville bleue et scientifique"));
        questions.add(new Question("Quel musée national de Rabat porte le nom de Mohammed VI et valorise l'art moderne ?", new String[]{"Musée Nejjarine", "Musée Mohammed VI", "Musée de la Kasbah", "Musée Batha"}, 1, "HARD"));
    }
}
