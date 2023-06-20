import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_creating-fixing-manifest-json'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/creating-fixing-manifest-json/11895')

'step 2: Add visual checkpoint at Page_t_creating-fixing-manifest-json'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01030_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
