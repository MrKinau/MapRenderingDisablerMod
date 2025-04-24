package dev.kinau.maprenderingdisabler.mixin;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MapRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.state.MapRenderState;
import net.minecraft.resources.ResourceLocation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MapRenderer.class)
public class MapRendererMixin {

	@Inject(method = "render", at = @At("HEAD"), cancellable = true)
	private void init(MapRenderState mapRenderState, PoseStack poseStack, MultiBufferSource multiBufferSource, boolean bl, int i, CallbackInfo info) {
		info.cancel();
	}
}