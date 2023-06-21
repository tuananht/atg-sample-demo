import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_script-execution-with-gitlab-pipeline'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/script-execution-with-gitlab-pipeline/84832')

'step 2: Add visual checkpoint at Page_t_script-execution-with-gitlab-pipeline'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00117_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
