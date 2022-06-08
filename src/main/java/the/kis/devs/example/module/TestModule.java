package the.kis.devs.example.module;

import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import the.kis.devs.api.features.module.CategoryAPI;
import the.kis.devs.api.features.module.ModuleAPI;

public class TestModule extends ModuleAPI
{
    public TestModule()
    {
        super("ExampleModule", "Test", CategoryAPI.MISC);
    }

    @Override
    public void onEnable(){
        super.onEnable();
        if(mc.player == null || mc.world == null) {
            return;
        }

//        ChatUtility.info().printClientModuleMessage("Enable event");
    }

    @Override
    public void onDisable() {
        super.onDisable();
        if(mc.player == null || mc.world == null) {
            return;
        }

//        ChatUtility.info().printClientModuleMessage("Disable event");
    }

    @Override
    public void update() {
        super.update();
        if(mc.player == null || mc.world == null) {
            return;
        }

//        ChatUtility.info().printClientModuleMessage("ClientTick event");
    }

    @SubscribeEvent
    public void onRender(RenderGameOverlayEvent.Text event) {
//        CustomFontUtil.drawStringWithShadow("Hello from ExampleModule!", 100, 100, -1);
    }
}