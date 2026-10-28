package potat369.textformattingeverywhere.mixin;

import net.minecraft.SharedConstants;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SharedConstants.class)
public class StringUtilMixin {
    @Inject(method = "isAllowedChatCharacter(C)Z", at = @At("RETURN"), cancellable = true)
    private static void isAllowedChatCharacter(char character, CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(character != 167 ? cir.getReturnValue() : true);
    }

}
