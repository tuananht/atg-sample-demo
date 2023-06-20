import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_script-working-fine-on-mac-chrome-headless-but-throwing-error-on-linux-chrome-headless'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/script-working-fine-on-mac-chrome-headless-but-throwing-error-on-linux-chrome-headless/29247')

'step 2: Add visual checkpoint at Page_t_script-working-fine-on-mac-chrome-headless-but-throwing-error-on-linux-chrome-headless'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00838_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
