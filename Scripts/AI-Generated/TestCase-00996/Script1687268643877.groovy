import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_enabling-data-url-in-katalon-studio'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/enabling-data-url-in-katalon-studio/54146')

'step 2: Add visual checkpoint at Page_t_enabling-data-url-in-katalon-studio'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00996_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
