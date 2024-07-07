package patterns.builder;

import patterns.builder.builders.Director;
import patterns.builder.builders.NpcBuilder;
import patterns.builder.builders.NpcManualBuilder;
import patterns.builder.entity.NPC;
import patterns.builder.entity.NpcManual;
import utils.Console;

public class Application {

    public void start() {
        Console.print("Enter NPC type");
        String npcType = Console.input().next();
        Director director = new Director();
        NpcBuilder npcBuilder = new NpcBuilder();
        NpcManualBuilder npcManualBuilder = new NpcManualBuilder();
        NPC npc;
        NpcManual npcManual;

        switch (npcType.toLowerCase()){
            case "humanoid": {
                director.constructHumanoidMageNpc(npcBuilder);
                npc = npcBuilder.getNpc();
                director.constructHumanoidMageNpc(npcManualBuilder);
                npcManual = npcManualBuilder.getNpcManual();
                break;
            }
            case "crocodile": {
                director.constructCrocodileNpc(npcBuilder);
                npc = npcBuilder.getNpc();
                director.constructCrocodileNpc(npcManualBuilder);
                npcManual = npcManualBuilder.getNpcManual();
                break;
            }
            default: throw new RuntimeException("Unsupported npc type: " + npcType);
        }

        System.out.println(npc);
        System.out.println(npcManual);
    }
}
