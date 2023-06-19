import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_no-way-to-know-which-object-in-repository-is-being-used-in-4'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/no-way-to-know-which-object-in-repository-is-being-used-in-scripts/51669/4')

'step 2: Add visual checkpoint at Page_t_no-way-to-know-which-object-in-repository-is-being-used-in-4'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00292_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
