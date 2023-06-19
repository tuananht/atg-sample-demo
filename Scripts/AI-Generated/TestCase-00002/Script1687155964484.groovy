import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_what-is-the-right-way-to-run-executions-on-testops-agents-local-or-docker-using-katalon-runtime-engine'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/what-is-the-right-way-to-run-executions-on-testops-agents-local-or-docker-using-katalon-runtime-engine/84642')

'step 2: Add visual checkpoint at Page_t_what-is-the-right-way-to-run-executions-on-testops-agents-local-or-docker-using-katalon-runtime-engine'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00002_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
