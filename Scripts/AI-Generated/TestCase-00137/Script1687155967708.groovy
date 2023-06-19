import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_cant-generate-error-report-using-bitbucket-pipelines-docker'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/cant-generate-error-report-using-bitbucket-pipelines-docker/21816')

'step 2: Add visual checkpoint at Page_t_cant-generate-error-report-using-bitbucket-pipelines-docker'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00137_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
