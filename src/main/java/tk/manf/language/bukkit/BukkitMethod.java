package tk.manf.language.bukkit;

import java.util.logging.Logger;
import org.bukkit.entity.Player;
import tk.manf.language.api.Message;

public final class BukkitMethod {
    public static final Message.Method<Player> SEND_MESSAGE = (p, m) -> {
        p.sendMessage(m.getRawContent());
    };

    public static final Message.Method<Player> KICK_PLAYER = (p, m) -> {
        p.kickPlayer(m.getRawContent());
    };

    public static final Message.Method<Logger> LOG_MESSAGE = (log, m) -> {
        //TODO: This sucks
        log.info(m.getRawContent());
    };

    //TODO: Lombok
    private BukkitMethod() {}
}
