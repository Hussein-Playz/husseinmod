package uk.infy.luna.mcsmld.mixins;

import appeng.menu.slot.RestrictedInputSlot;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import uk.infy.luna.mcsmld.setup.LunaItems;

@Mixin(value = RestrictedInputSlot.class)
public class MixinRestrictedInputSlot {

    @Inject(method = "mayPlace", at = @At("HEAD"), cancellable = true)
    private void mayPlace(ItemStack stack, CallbackInfoReturnable<Boolean> cir) {
        if (stack.is(LunaItems.INFINITY_CARD.get()) || stack.is(LunaItems.DIMENSION_CARD.get()) || stack.is(LunaItems.TRUE_CARD.get())) {
            cir.setReturnValue(true);
        }
    }

}
