package com.gabbas.quizapp_gabbas.data;

import static com.gabbas.quizapp_gabbas.data.QuestionFactory.easy;
import static com.gabbas.quizapp_gabbas.data.QuestionFactory.hard;
import static com.gabbas.quizapp_gabbas.data.QuestionFactory.medium;

import java.util.ArrayList;

public class MarrakechQuestions {

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
        questions.add(easy("Marrakech est surnommée la ville ... ?", 1, "Blanche", "Rouge", "Bleue", "Verte"));
        questions.add(easy("Quelle chaîne de montagnes borde Marrakech ?", 1, "Rif", "Atlas", "Himalaya", "Andes"));
        questions.add(easy("Marrakech se trouve dans quelle plaine ?", 1, "Gharb", "Haouz", "Saïs", "Chaouia"));
        questions.add(easy("Quel sommet emblématique domine la région de Marrakech ?", 0, "Toubkal", "Everest", "Mont Blanc", "Kilimandjaro"));
        questions.add(easy("Dans quelle région se situe Marrakech ?", 1, "Casablanca-Settat", "Marrakech-Safi", "Souss-Massa", "Rabat-Salé-Kénitra"));
        questions.add(easy("Quel jardin très connu a été créé par le peintre Jacques Majorelle ?", 0, "Jardin Majorelle", "Jardin andalou", "Jardin Harti", "Jardin d'Essai"));
        questions.add(new Question("Comment s'appelle l'aéroport international de Marrakech ?", new String[]{"Marrakech-Atlas", "Marrakech-Ménara", "Marrakech-Saïss", "Marrakech-Bouregreg"}, 1, "EASY"));
        questions.add(new Question("Quel quartier historique de Marrakech abrite la place Jemaa el-Fna ?", new String[]{"Guéliz", "Hivernage", "La médina", "La Palmeraie"}, 2, "EASY"));

        questions.add(medium("Quel désert de pierres se trouve près de Marrakech ?", 1, "Sahara", "Agafay", "Gobi", "Atacama"));
        questions.add(medium("Quel oued arrose traditionnellement les environs de Marrakech ?", 1, "Sebou", "Tensift", "Moulouya", "Bouregreg"));
        questions.add(medium("La ville est souvent décrite comme partagée entre la médina et quel quartier moderne ?", 1, "Agdal", "Guéliz", "Sidi Youssef", "Hay Mohammadi"));
        questions.add(medium("Comment s'appelle le grand bassin d'eau entouré d'oliviers au nord-ouest de la médina ?", 1, "Majorelle", "Ménara", "Agdal", "Palmeraie"));
        questions.add(medium("Quel vaste espace planté de palmiers borde la ville ?", 2, "Rif", "Saïs", "Palmeraie", "Merdja"));
        questions.add(medium("Quel quartier moderne est célèbre pour ses hôtels et ses jardins à Marrakech ?", 3, "Kasbah", "Mellah", "Bab Doukkala", "Hivernage"));
        questions.add(new Question("Quelle vallée au pied du Haut Atlas est fréquemment visitée depuis Marrakech ?", new String[]{"Vallée du Bouregreg", "Vallée de l'Ourika", "Vallée du Sebou", "Vallée du Loukkos"}, 1, "MEDIUM"));
        questions.add(new Question("Quel barrage proche de Marrakech a créé un lac très connu au sud-ouest de la ville ?", new String[]{"Barrage Bin El Ouidane", "Barrage Idriss Ier", "Barrage Lalla Takerkoust", "Barrage Al Wahda"}, 2, "MEDIUM"));

        questions.add(hard("La station d'Oukaïmeden se trouve dans quelle partie de l'Atlas ?", 2, "Moyen Atlas", "Anti-Atlas", "Haut Atlas", "Rif"));
        questions.add(hard("Quel vaste jardin historique irrigué longe le sud de la médina ?", 0, "Les jardins de l'Agdal", "Les jardins andalous", "Le parc de la Ligue arabe", "Les jardins exotiques"));
        questions.add(hard("Marrakech se situe à environ quelle altitude moyenne ?", 1, "50 m", "460 m", "1200 m", "2200 m"));
        questions.add(new Question("Quel col routier emblématique relie Marrakech à Ouarzazate à travers le Haut Atlas ?", new String[]{"Tizi n'Test", "Col du Zad", "Tizi n'Tichka", "Col du Kerdous"}, 2, "HARD"));
    }

    private static void addScienceQuestions(ArrayList<Question> questions) {
        questions.add(easy("Quel type de climat règne à Marrakech ?", 1, "Méditerranéen humide", "Semi-aride", "Tropical", "Polaire"));
        questions.add(easy("Quelle université publique majeure se trouve à Marrakech ?", 1, "Al Akhawayn", "Cadi Ayyad", "Mohammed V", "Al Quaraouiyine"));
        questions.add(easy("Le jardin Majorelle contient une grande collection de ?", 1, "Roses", "Cactus", "Tulipes", "Bambous"));
        questions.add(easy("Comment s'appelle le système d'irrigation traditionnel utilisé dans la région ?", 1, "Canal romain", "Khettara", "Aqueduc alpin", "Digue flottante"));
        questions.add(easy("La ville est connue pour son architecture en ?", 1, "Verre et acier", "Terre et pisé", "Marbre blanc", "Bois nordique"));
        questions.add(easy("L'observatoire d'Oukaïmeden près de Marrakech est spécialisé en ?", 1, "Botanique", "Astronomie", "Géologie", "Zoologie"));
        questions.add(new Question("Quel aéroport accueille la majorité des vols internationaux vers Marrakech ?", new String[]{"Rabat-Salé", "Marrakech-Ménara", "Mohammed V", "Ibn Battouta"}, 1, "EASY"));
        questions.add(new Question("Quel type d'énergie est favorisé à Marrakech grâce à son fort ensoleillement ?", new String[]{"Énergie marémotrice", "Énergie solaire", "Énergie nucléaire", "Énergie géothermique froide"}, 1, "EASY"));

        questions.add(medium("Marrakech a accueilli quelle conférence mondiale sur le climat en 2016 ?", 1, "COP21", "COP22", "COP26", "COP28"));
        questions.add(medium("Quel arbre emblématique pousse dans la région plus au sud-ouest de Marrakech ?", 1, "Sapin", "Arganier", "Bouleau", "Cèdre du Liban"));
        questions.add(medium("Quel facteur naturel explique les fortes amplitudes thermiques à Marrakech ?", 2, "L'altitude polaire", "Le Gulf Stream", "L'éloignement de la mer", "Le volcanisme"));
        questions.add(medium("Quelle chaîne proche permet l'approvisionnement en eau de retenue et de montagne ?", 3, "Rif", "Anti-Atlas", "Plateau central", "Haut Atlas"));
        questions.add(medium("Quel type de transport urbain écologique a été étudié pour Marrakech ces dernières années ?", 1, "Métro souterrain", "Bus électriques", "Téléphérique marin", "Tramway rural"));
        questions.add(medium("Pourquoi les murs de Marrakech prennent-ils une teinte rouge ?", 2, "À cause du granit", "À cause du sel", "À cause de la terre argileuse", "À cause du cuivre"));
        questions.add(new Question("Quel barrage proche de Marrakech forme un lac très fréquenté pour l'étude de l'eau et les loisirs ?", new String[]{"Barrage Lalla Takerkoust", "Barrage Youssef Ben Tachfine", "Barrage Al Massira", "Barrage Hassan Addakhil"}, 0, "MEDIUM"));
        questions.add(new Question("Quelle vallée proche de Marrakech illustre les enjeux d'irrigation au pied de l'Atlas ?", new String[]{"Vallée du Bouregreg", "Vallée de l'Ourika", "Vallée du Sebou", "Vallée du Nekkor"}, 1, "MEDIUM"));

        questions.add(hard("Quel site scientifique d'altitude près de Marrakech est aussi réputé pour la qualité de son ciel ?", 3, "Michlifen", "Tazekka", "Tidghine", "Oukaïmeden"));
        questions.add(hard("Quel mode d'irrigation alimente historiquement les jardins de l'Agdal et de la Ménara ?", 1, "Dessalement", "Seguias et khettaras", "Puits artésiens modernes", "Glaciers"));
        questions.add(hard("Quel type de rayonnement solaire fait de Marrakech une zone favorable au photovoltaïque ?", 0, "Un fort ensoleillement annuel", "Une nuit polaire", "Un climat océanique froid", "Une mousson estivale"));
        questions.add(new Question("Quel observatoire de haute altitude près de Marrakech dépend de l'université Cadi Ayyad ?", new String[]{"Michlifen", "Oukaïmeden", "Timoulay", "Bouregreg"}, 1, "HARD"));
    }

    private static void addSportQuestions(ArrayList<Question> questions) {
        questions.add(easy("Quel est le club de football phare de Marrakech ?", 1, "WAC", "Kawkab Marrakech", "Raja CA", "MAS Fès"));
        questions.add(easy("Comment s'appelle le grand stade de la ville ?", 1, "Stade Mohammed V", "Grand Stade de Marrakech", "Stade Adrar", "Stade Moulay Abdellah"));
        questions.add(easy("Quel marathon célèbre a lieu à Marrakech ?", 1, "Marathon de Paris", "Marathon international de Marrakech", "Marathon de Boston", "Marathon d'Agadir"));
        questions.add(easy("Marrakech est une destination prisée pour quel sport de détente ?", 1, "Hockey", "Golf", "Curling", "Baseball"));
        questions.add(easy("Quelle épreuve automobile s'est tenue dans les rues de Marrakech ?", 1, "Formule 1", "WTCC / Formule E", "MotoGP", "Nascar"));
        questions.add(easy("La station de ski près de Marrakech s'appelle ?", 1, "Ifrane", "Oukaïmeden", "Michlifen", "Tazekka"));
        questions.add(new Question("Quel sport d'hiver peut se pratiquer à Oukaïmeden près de Marrakech ?", new String[]{"Ski", "Surf", "Aviron", "Baseball"}, 0, "EASY"));
        questions.add(new Question("Quel sport est très populaire sur les nombreux parcours de Marrakech ?", new String[]{"Curling", "Golf", "Hockey sur glace", "Polo nautique"}, 1, "EASY"));

        questions.add(medium("Les couleurs traditionnelles du Kawkab Marrakech sont ?", 1, "Bleu et blanc", "Rouge et blanc", "Vert et noir", "Jaune et bleu"));
        questions.add(medium("Quel sport équestre est pratiqué au Royal Polo Club de Marrakech ?", 1, "Rodéo", "Polo", "Lancer de javelot", "Dressage de taureaux"));
        questions.add(medium("Quel type d'épreuves de course attire de nombreux athlètes amateurs à Marrakech ?", 2, "Ultra-triathlon sur glace", "Rallye maritime", "Marathons et semi-marathons", "Ski nordique"));
        questions.add(medium("Quel grand stade de Marrakech a accueilli des matchs internationaux et du Mondial des clubs ?", 1, "Stade El Bachir", "Grand Stade de Marrakech", "Stade municipal d'Ifrane", "Stade Père Jégo"));
        questions.add(medium("Quelle discipline profite du relief autour de Marrakech pour les stages en altitude ?", 0, "Trail et course à pied", "Voile", "Aviron", "Hockey"));
        questions.add(medium("Quel circuit urbain portait le nom du prince héritier avant la Formule E ?", 3, "Circuit Hassan II", "Circuit Al Hoceïma", "Circuit Toubkal", "Circuit Moulay El Hassan"));
        questions.add(new Question("Quel club marrakchi est souvent abrégé KACM ?", new String[]{"Kawkab Athlétique Club de Marrakech", "Kasbah Association Club de Marrakech", "Koutoubia Athlétique Central Marrakech", "Kénitra Association Club Maroc"}, 0, "MEDIUM"));
        questions.add(new Question("Quel circuit urbain de Marrakech a accueilli le WTCC puis la Formule E ?", new String[]{"Circuit Ibn Battouta", "Circuit Moulay El Hassan", "Circuit Hassan II", "Circuit Agafay"}, 1, "MEDIUM"));

        questions.add(hard("Quelle série internationale FIA est passée par le circuit Moulay El Hassan avant l'ère Formule E ?", 0, "WTCC", "WRC", "Moto2", "IndyCar"));
        questions.add(hard("Quel atout naturel fait de Marrakech une destination golfique toute l'année ?", 2, "La neige permanente", "La mousson", "Un climat sec et ensoleillé", "Les marées atlantiques"));
        questions.add(hard("Quel club de Marrakech est abrégé KACM ?", 1, "Kawkab Association Club du Mellah", "Kawkab Athlétique Club de Marrakech", "Koutoubia Athletic Club Maroc", "Kasbah Athlétic Club Marrakech"));
        questions.add(new Question("Quel prince a donné son nom au circuit urbain de Marrakech ?", new String[]{"Moulay Rachid", "Moulay Ismaïl", "Moulay El Hassan", "Moulay Abdallah"}, 2, "HARD"));
    }

    private static void addFilmQuestions(ArrayList<Question> questions) {
        questions.add(easy("Quel festival de cinéma se tient chaque année à Marrakech ?", 1, "Cannes", "Festival international du film de Marrakech", "Oscars", "Mostra de Venise"));
        questions.add(easy("Quel film d'Alfred Hitchcock a été tourné à Marrakech ?", 1, "Psychose", "L'Homme qui en savait trop", "Les Oiseaux", "Sueurs froides"));
        questions.add(easy("Le film Sex and the City 2 a été tourné en partie à Marrakech ?", 0, "Oui", "Non", "Seulement à Rabat", "Seulement à Fès"));
        questions.add(easy("La place Jemaa el-Fna apparaît dans de nombreuses productions audiovisuelles ?", 0, "Vrai", "Faux", "Jamais", "Uniquement en dessin animé"));
        questions.add(easy("Quel film d'action avec Tom Cruise contient une scène marquante tournée à Marrakech ?", 1, "Top Gun", "Mission Impossible: Rogue Nation", "Oblivion", "Minority Report"));
        questions.add(easy("Les studios les plus utilisés pour les grandes épopées près de Marrakech se trouvent surtout à ?", 1, "Tanger", "Ouarzazate", "Rabat", "El Jadida"));
        questions.add(new Question("Quel palais de Marrakech offre un décor visuel prisé pour les tournages historiques ?", new String[]{"Palais Bahia", "Palais présidentiel de Rabat", "Palais Badi de Meknès", "Palais Nejjarine"}, 0, "EASY"));
        questions.add(new Question("Quelle place très animée de Marrakech est l'un des décors les plus filmés de la ville ?", new String[]{"Place Mohammed V", "Jemaa el-Fna", "Place des Nations", "Petit Socco"}, 1, "EASY"));

        questions.add(medium("Quel nom porte le festival de cinéma de Marrakech en abrégé ?", 0, "FIFM", "FICM", "FMM", "MIFA"));
        questions.add(medium("Quel intérêt visuel attire les réalisateurs à Marrakech ?", 2, "Ses gratte-ciel", "Ses fjords", "Ses riads, souks et remparts", "Ses glaciers"));
        questions.add(medium("Quel célèbre réalisateur britannique a filmé la médina de Marrakech dans les années 1950 ?", 3, "Ridley Scott", "David Lean", "Christopher Nolan", "Alfred Hitchcock"));
        questions.add(medium("Quel personnage de la pop culture liée à New York a conduit l'équipe de Sex and the City à Marrakech ?", 0, "Carrie Bradshaw", "Rachel Green", "Serena van der Woodsen", "Bridget Jones"));
        questions.add(medium("Quel genre profite particulièrement des décors de palais et de souks de Marrakech ?", 1, "Comédie scolaire", "Film d'aventure", "Film sous-marin", "Western arctique"));
        questions.add(medium("Le festival du film de Marrakech attire surtout quel type d'invités ?", 2, "Seulement des sportifs", "Uniquement des chanteurs", "Réalisateurs, acteurs et producteurs", "Des navigateurs"));
        questions.add(new Question("Quel palais de Marrakech est souvent filmé pour ses cours, jardins et mosaïques ?", new String[]{"Palais Bahia", "Borj Nord", "Palais Royal de Fès", "Kasbah des Oudayas"}, 0, "MEDIUM"));
        questions.add(new Question("Quel sigle désigne le Festival international du film de Marrakech ?", new String[]{"MIF", "FIFM", "CMM", "FIFR"}, 1, "MEDIUM"));

        questions.add(hard("Quel organisme marocain collabore souvent avec le festival de Marrakech pour le secteur du cinéma ?", 3, "ONCF", "ANRT", "MASEN", "CCM"));
        questions.add(hard("Quel élément de la ville rend les plans nocturnes de Marrakech particulièrement reconnaissables ?", 0, "L'animation de Jemaa el-Fna", "Les phares maritimes", "Les tramways", "Les pistes enneigées"));
        questions.add(hard("Quel film d'Hitchcock tourné à Marrakech mettait en scène James Stewart ?", 1, "Fenêtre sur cour", "L'Homme qui en savait trop", "Les Enchaînés", "Rebecca"));
        questions.add(new Question("Quel palais saadien en ruines de Marrakech signifie littéralement l'Incomparable ?", new String[]{"El Badi", "Bahia", "Dar Batha", "Dar Si Saïd"}, 0, "HARD"));
    }

    private static void addCultureQuestions(ArrayList<Question> questions) {
        questions.add(easy("Quelle est la place la plus célèbre de Marrakech ?", 1, "Place Rouge", "Jemaa el-Fna", "Place de la Concorde", "Place du 16 Novembre"));
        questions.add(easy("Quel minaret est le symbole de Marrakech ?", 1, "Tour Hassan", "Koutoubia", "Giralda", "Big Ben"));
        questions.add(easy("Marrakech a été fondée par quelle dynastie ?", 1, "Alaouite", "Almoravide", "Idrisside", "Mérinide"));
        questions.add(easy("Quel plat est particulièrement associé à Marrakech ?", 1, "Pastilla", "Tanjia", "Rfissa", "Harira"));
        questions.add(easy("Comment s'appelle le quartier des artisans de Marrakech ?", 1, "La Marina", "Les souks", "Le boulevard", "Le port"));
        questions.add(easy("Marrakech est inscrite au patrimoine mondial de quelle organisation ?", 1, "ONU", "UNESCO", "OMS", "UNICEF"));
        questions.add(new Question("Quel palais de Marrakech est célèbre pour ses jardins et ses zelliges ?", new String[]{"Palais Bahia", "Palais El Badi de Rabat", "American Legation", "Borj Nord"}, 0, "EASY"));
        questions.add(new Question("Quel jardin bleu de Marrakech est associé à Yves Saint Laurent ?", new String[]{"Jnan Sbil", "Jardins andalous", "Jardin Majorelle", "Parc Perdicaris"}, 2, "EASY"));

        questions.add(medium("Les tombeaux de quelle dynastie sont un site touristique célèbre à Marrakech ?", 1, "Alaouite", "Saadienne", "Idrisside", "Wattasside"));
        questions.add(medium("Quel palais est surnommé le palais de la belle ?", 1, "Palais El Badi", "Palais Bahia", "Palais Royal", "Palais de Badiâa"));
        questions.add(medium("Quels jardins historiques sont associés à un grand bassin et un pavillon ?", 2, "Jardins andalous", "Jardins exotiques", "Jardins de la Ménara", "Jardins de l'Agdal de Fès"));
        questions.add(medium("Quel artiste français a donné son nom au jardin Majorelle ?", 0, "Jacques Majorelle", "Henri Matisse", "Claude Monet", "Paul Cézanne"));
        questions.add(medium("Quel thé est traditionnellement offert aux visiteurs à Marrakech ?", 1, "Thé noir fumé", "Thé à la menthe", "Matcha", "Chai indien"));
        questions.add(medium("Quel quartier ancien accueille un important mellah historique ?", 2, "Guéliz", "Hivernage", "Mellah de la médina", "Palmeraie"));
        questions.add(new Question("Quel quartier moderne de Marrakech s'est développé hors des remparts à l'époque du protectorat ?", new String[]{"Guéliz", "Kasbah", "Mellah", "Agdal de Fès"}, 0, "MEDIUM"));
        questions.add(new Question("Quel palais saadien en ruines a été construit après la bataille des Trois Rois ?", new String[]{"Palais Bahia", "Palais El Badi", "Palais Batha", "Dar al-Makhzen"}, 1, "MEDIUM"));

        questions.add(hard("Quel sultan saadien a fait construire le palais El Badi ?", 0, "Ahmed al-Mansour", "Moulay Ismaïl", "Yacoub El Mansour", "Mohammed Ben Abdellah"));
        questions.add(hard("Comment s'appellent les grands jardins royaux au sud de la médina ?", 2, "Jardins des Oudayas", "Jardins Harti", "Jardins de l'Agdal", "Jardins du Bouregreg"));
        questions.add(hard("Quelle institution culturelle internationale soutient la sauvegarde du patrimoine immatériel de Jemaa el-Fna ?", 1, "FIFA", "UNESCO", "OMC", "UEFA"));
        questions.add(new Question("Quel souverain saadien a fait de Marrakech une capitale rayonnante au XVIe siècle ?", new String[]{"Ahmed al-Mansour", "Moulay Hafid", "Idriss II", "Hassan Ier"}, 0, "HARD"));
    }
}
