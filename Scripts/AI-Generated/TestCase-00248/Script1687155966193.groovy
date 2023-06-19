import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_loops-in-katalon-automation-16'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/loops-in-katalon-automation-recorder/8291/16')

'step 2: Add visual checkpoint at Page_t_loops-in-katalon-automation-16'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00248_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
