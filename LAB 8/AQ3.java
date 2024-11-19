interface Sports {
    int getNumberOfGoals();
    String displayTeam();
}

class Hockey implements Sports {
    private int goalsTeamA, goalsTeamB;
    private String teamA, teamB;

    public Hockey(int goalsTeamA, int goalsTeamB, String teamA, String teamB) {
        this.goalsTeamA = goalsTeamA;
        this.goalsTeamB = goalsTeamB;
        this.teamA = teamA;
        this.teamB = teamB;
    }

    @Override
    public int getNumberOfGoals() {
        return Math.max(goalsTeamA, goalsTeamB);
    }

    @Override
    public String displayTeam() {
        if (goalsTeamA > goalsTeamB) {
            return teamA + " is the winning team.";
        } else if (goalsTeamB > goalsTeamA) {
            return teamB + " is the winning team.";
        } else {
            return "It's a draw!";
        }
    }
}

class Football implements Sports {
    private int goalsTeamA, goalsTeamB;
    private String teamA, teamB;

    public Football(int goalsTeamA, int goalsTeamB, String teamA, String teamB) {
        this.goalsTeamA = goalsTeamA;
        this.goalsTeamB = goalsTeamB;
        this.teamA = teamA;
        this.teamB = teamB;
    }

    @Override
    public int getNumberOfGoals() {
        return Math.max(goalsTeamA, goalsTeamB);
    }

    @Override
    public String displayTeam() {
        if (goalsTeamA > goalsTeamB) {
            return teamA + " is the winning team.";
        } else if (goalsTeamB > goalsTeamA) {
            return teamB + " is the winning team.";
        } else {
            return "It's a draw!";
        }
    }
}

class Main {
    public static void main(String[] args) {
        Hockey hockey = new Hockey(5, 3, "Team A", "Team B");
        System.out.println("Hockey: " + hockey.getNumberOfGoals());
        System.out.println(hockey.displayTeam());

        Football football = new Football(2, 2, "Real Madrid", "Barcelona");
        System.out.println("Football: " + football.getNumberOfGoals());
        System.out.println(football.displayTeam());
    }
}
