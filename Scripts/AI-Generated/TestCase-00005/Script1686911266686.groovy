import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_giveaway-announcing-the-new-katalon-community-hub'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/giveaway-announcing-the-new-katalon-community-hub/89762')

'step 2: Add visual checkpoint at Page_t_giveaway-announcing-the-new-katalon-community-hub'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00005_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
