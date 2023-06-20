import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_identifying-checkbox-by-neighboring-label'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/identifying-checkbox-by-neighboring-label/50825')

'step 2: Add visual checkpoint at Page_t_identifying-checkbox-by-neighboring-label'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00628_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
