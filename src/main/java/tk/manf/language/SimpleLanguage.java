package tk.manf.language;

import java.util.logging.Logger;
import org.bukkit.entity.Player;
import tk.manf.language.bukkit.LanguageHelper;

public class SimpleLanguage {
    /**
     * Simple Proof of Concept
     */
    public static void main() {
        // Actually this WILL throw a NPE
        Player p = null;
        
        // In case our Player needs Help
        Language.HELP.sendMessage(p);
        // Log Message to Console
        Language.STARTED_API.log(Logger.getGlobal());
        // Kick player easily
        Language.KICK_MESSAGE.kickPlayer(p);
    }
    
    public static enum Language implements LanguageHelper {
        STARTED_API,
        HELP,
        KICK_MESSAGE;
        
        @Override
        public String getRawContent() {
            // Add Helpers for save and load
            return name();
        }
    }
}
