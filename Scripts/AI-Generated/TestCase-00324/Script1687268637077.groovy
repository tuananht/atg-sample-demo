import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_remove-the-focus-from-an-element-after-settext-or-sendkeys'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/remove-the-focus-from-an-element-after-settext-or-sendkeys/30878')

'step 2: Add visual checkpoint at Page_t_remove-the-focus-from-an-element-after-settext-or-sendkeys'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00324_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
