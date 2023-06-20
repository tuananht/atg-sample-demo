import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_i-am-not-able-to-activate-katalon-studio-getting-a-message-to-make-sure-my-credentials-are-3'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/i-am-not-able-to-activate-katalon-studio-getting-a-message-to-make-sure-my-credentials-are-valid/64998/3')

'step 2: Add visual checkpoint at Page_t_i-am-not-able-to-activate-katalon-studio-getting-a-message-to-make-sure-my-credentials-are-3'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01200_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
