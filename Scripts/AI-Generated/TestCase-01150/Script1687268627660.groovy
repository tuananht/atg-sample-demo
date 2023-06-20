import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_cant-store-a-list-of-elements-to-create-3'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/cant-store-a-list-of-elements-to-create-assertions/87323/3')

'step 2: Add visual checkpoint at Page_t_cant-store-a-list-of-elements-to-create-3'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01150_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
