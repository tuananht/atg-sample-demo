import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_globalvariable-map-is-not-picking-up-the-latest-key-6'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/globalvariable-map-is-not-picking-up-the-latest-key-value/13625/6')

'step 2: Add visual checkpoint at Page_t_globalvariable-map-is-not-picking-up-the-latest-key-6'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01181_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
