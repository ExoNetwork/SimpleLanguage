package tk.manf.language.bukkit;

import java.util.logging.Logger;
import org.bukkit.entity.Player;
import tk.manf.language.api.Message;

public interface LanguageHelper extends Message{
    public default void sendMessage(Player p){
        send(p, BukkitMethod.SEND_MESSAGE);
    }
    
    /**
     * Kicks the given Player with this Message Reason
     * @param p 
     */
    public default void kickPlayer(Player p){
        send(p, BukkitMethod.KICK_PLAYER);
    }
    
    public default void log(Logger logger) {
        send(logger, BukkitMethod.LOG_MESSAGE);
    }
    
    /**
     * Returns raw Message of this Message
     * @deprecated use appropiate container
     * @return 
     */
    @Override
    public String getRawContent();
}